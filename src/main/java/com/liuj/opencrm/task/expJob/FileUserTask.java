package com.liuj.opencrm.task.expJob;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @Title:
 * @author: Liu jiang
 * @Date: 2022-01-19 10:39
 * @FilePath: Quartz  ==> FileUserTask
 */
public class FileUserTask implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("测试文件上传成功");
    }
}
