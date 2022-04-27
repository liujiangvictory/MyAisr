package com.liuj.opencrm.task;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * @Title:扫描任务数据的作业
 * @author: Liu jiang
 * @Date: 2022-01-18 16:42
 * @FilePath: Quartz  ==> TaskScanJob
 * <p>
 * <p>
 * 处理逻辑
 * <p>
 * 1、此作业每隔5分钟扫描task这个表，扫描的间隔时间可以灵活配置
 * 扫描task表中的task_state为0和2
 * 2、扫描数据后，获得当前调度器中正在执行的任务，如果发现有正在执行的任务，那么此任务ID不会更新到调度器中
 * 等待下一次的扫描数据并且作业处于未执行状态，那么才会更新此任务
 * 3、如果可以更新任务，那么更新任务操作的顺序是
 * 1) 首先删除此任务，并且删除此任务关联的触发器
 * 2) 新建任务，新建触发器，将此任务和触发器关联加入到调度器中
 */
public class TaskScanJob implements Job {
    private transient static Log log = LogFactory.getLog(TaskScanJob.class);

    public final static DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public TaskScanJob() {
    }

    /*@Title： 真正的执行任务
     * @Author Liu jiang
     * @Date 17:39 2022/1/18
     * @Param
     * @return
     **/
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        try {
            _execute(context);
        } catch (Throwable ex) {
            log.error("执行扫描任务出现异常", ex);
        }
    }

    /*@Title： 内部执行任务
     * @Author Liu jiang
     * @Date 17:39 2022/1/18
     * @Param
     * @return
     **/
    private void _execute(JobExecutionContext context) throws Exception {
        log.info("扫描任务执行");
        JobDataMap data = context.getJobDetail().getJobDataMap();

        String taskType = data.getString(TaskFrameWork.TASK_TYPE);
        long mod = data.getLong(TaskFrameWork.DATASPLIT_MOD);
        long value = data.getLong(TaskFrameWork.DATASPLIT_VALUE);

        //准备任务,查询进程表


    }


}
