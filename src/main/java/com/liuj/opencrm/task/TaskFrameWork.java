package com.liuj.opencrm.task;

import com.liuj.opencrm.util.ResourceUtil;
import org.apache.commons.lang.StringUtils;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * @Title: 调度启动的主进程
 * @author: Liu jiang
 * @Date: 2022-01-18 16:09
 * @FilePath: Quartz  ==> TaskFrameWork
 * 调度系统分为三大子系统
 * 1、作业系统
 * 也就是个性化的需要完成的任务接口的实现
 * 2、触发系统
 * 定义为触发作业系统去工作的系统。
 * 现在分为，立即触发、cron（周期）触发、定时触发
 * 3、调度系统
 * 调度系统为主要进程，去协调处理作业系统和触发系统
 */
public class TaskFrameWork {
    private transient static Logger log = LoggerFactory.getLogger(TaskFrameWork.class);
    //任务类型
    public static final String TASK_TYPE = "TASK_TYPE";
    //数据分片mod
    public static final String DATASPLIT_MOD = "DATASPLIT_MOD";
    //数据分片的value
    public static final String DATASPLIT_VALUE = "DATASPLIT_VALUE";

    //任务
    public static final String TASK_ID = "TASK_ID";
    public static final String TASK_JOB_GROUP = "TASK_JOB_GROUP";
    public static final String TASK_TRIGGER_GROUP = "TASK_TRIGGER_GROUP";

    //任务方式
    public static final String TASK_METHOD_FIXED = "F";
    public static final String TASK_METHOD_IMMEDIATE = "I";
    public static final String TASK_METHOD_CRON = "C";

    /**
     * 空构造函数
     */
    public TaskFrameWork() {
    }

    public static void main(String[] args) throws Exception {
        if (args == null || args.length != 3) {
            System.out.println("任务调度框架必须传入3个参数[ 任务类型  任务取模  任务模值 ]");
            System.exit(-1);
        }
        String taskType = args[0].trim();

        log.info("提醒:由于在一个线程中使用的数据库连接可能超过1个，请至少配置的连接池的最大数量为线程数量的1.5倍!");

        //默认的启动暂停为3秒
        long bootPauseSeconds = 3;
        //默认的scanDataJob.cron的参数，每隔5分钟
        String scanDataJobCron = "0 0/5 * * * ?";
        //加载配置参数
        Properties prop = ResourceUtil.loadPropertiesFromClassPath("task/task.properties", "task", true);
        if (!StringUtils.isBlank(prop.getProperty("bootPauseSeconds"))
                &&
                StringUtils.isNumeric(prop.getProperty("bootPauseSeconds"))) {
            bootPauseSeconds = Long.parseLong(prop.getProperty("bootPauseSeconds").trim());
        }
        if (!StringUtils.isBlank(prop.getProperty("scanDataJobCron"))) {
            scanDataJobCron = prop.getProperty("scanDataJobCron").trim();
        } else {
            log.info("没有配置scanDataJobCron参数,取默认的配置:" + scanDataJobCron);
        }

        log.info("启动暂停时间为:" + bootPauseSeconds + "秒");
        log.info("scanDataJobCron参数配置为:" + scanDataJobCron);
        //加载配置参数完成

        //取数据分片参数
        int mod = 1;
        int value = 0;
        if (!StringUtils.isBlank(args[1])
                && !StringUtils.isBlank(args[2])
                && StringUtils.isNumeric(args[1])
                && StringUtils.isNumeric(args[2])
        ) {
            mod = Integer.valueOf(args[1].trim()).intValue();
            value = Integer.valueOf(args[2].trim()).intValue();
            log.info("配置了任务数据分片,此进程的数据分片参数配置为: mod=" + mod + ",value=" + value);
            log.info("提示:由于配置了数据分片,请将其它数据分片的进程启动,否则会有部分任务没有处理!");
        } else {
            log.info("没有配置任务数据分片,本进程取全部任务数据,请确保不要启动多份此进程");
        }
        //取数据分片完成

        //准备标准的调度系统
        SchedulerFactory objSchedulerFactory = new StdSchedulerFactory(prop);
        Scheduler objScheduler = objSchedulerFactory.getScheduler();
        try {
            JobDetail job = JobBuilder.newJob(TaskScanJob.class)
                    .withIdentity("TaskScanJob", "TaskScanJobGrp")
                    .build();
            TriggerKey triggerKey = TriggerKey.triggerKey("TaskScanTrigger", "TaskScanTriggerGrp");
            Trigger trigger = objScheduler.getTrigger(triggerKey);
            //如果第一次启动触发器，就需要实例化触发器
            if (trigger == null) {

                trigger = TriggerBuilder.newTrigger()
                        .withIdentity(triggerKey)
                        //10秒执行一次
                        .withSchedule(CronScheduleBuilder.cronSchedule(scanDataJobCron))
                        .startNow()
                        .build();
            }
            //传入数据分片参数
            job.getJobDataMap().put(TaskFrameWork.TASK_TYPE, taskType);
            job.getJobDataMap().put(TaskFrameWork.DATASPLIT_MOD, new Long(mod));
            job.getJobDataMap().put(TaskFrameWork.DATASPLIT_VALUE, new Long(value));

            objScheduler.scheduleJob(job, trigger);
        } catch (Exception ex) {
            log.error("扫描作业加入失败,系统退出", ex);
            System.exit(-1);
        }
        //启动调度系统
        log.info("开始启动调度系统…………");
        objScheduler.start();

        //启动休眠指定时间
        Thread.currentThread().sleep(bootPauseSeconds);
        log.info("启动调度系统完成");

    }
}
