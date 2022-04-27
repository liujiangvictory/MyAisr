package com.liuj.opencrm.lt.service.impl;

import com.liuj.opencrm.lt.bean.BOcfgTask;
import com.liuj.opencrm.lt.dao.BOcfgTaskMapper;
import com.liuj.opencrm.lt.service.CfgTaskService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
/**
 * @Title:
 * @author: Liu jiang
 * @Date: 2022-04-27 15:09
 * @FilePath: demo  ==> cfgTaskServiceImpl
 */
@Service
@Slf4j
public class cfgTaskServiceImpl  implements CfgTaskService {

   /*  @Autowired
     public BOcfgTaskMapper bocfgTaskMapper ;
*/

    /*@Title： 根据cfg_task_id查询进程
     * @Author Liu jiang
     * @Date 16:03 2022/4/27
     * @Param
     * @return
     **/
    public BOcfgTask selectByPrimaryKey(Integer cfg_task_id) {
        /*log.info("方法 selectByPrimaryKey   ======  根据cfg_task_id查询进程表开始");
         BOcfgTask   cfgTask = new BOcfgTask();
        if(StringUtils.isEmpty(String.valueOf(cfg_task_id))){
             cfgTask =   bocfgTaskMapper.selectByPrimaryKey(cfg_task_id);
        }else{
            log.info("方法 selectByPrimaryKey   ======  入参cfg_task_id为空  ");
        }
        return cfgTask;*/
        return null;
    }
}
