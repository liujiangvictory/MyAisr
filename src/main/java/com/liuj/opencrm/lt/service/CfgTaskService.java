package com.liuj.opencrm.lt.service;

import com.liuj.opencrm.lt.bean.BOcfgTask;

/**
 * @Title:
 * @author: Liu jiang
 * @Date: 2022-04-27 15:07
 * @FilePath: demo
 */
public interface CfgTaskService {

    /*@Title： 根据cfg_task_id查询进程
     * @Author Liu jiang
     * @Date 16:03 2022/4/27
     * @Param
     * @return
     **/
    BOcfgTask selectByPrimaryKey(Integer cfg_task_id);



}
