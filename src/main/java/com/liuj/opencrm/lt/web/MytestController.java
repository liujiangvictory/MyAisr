package com.liuj.opencrm.lt.web;

import com.liuj.opencrm.lt.bean.BOcfgTask;
import com.liuj.opencrm.lt.service.CfgTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Title: 自定义测试Contorller
 * @author: Liu jiang
 * @Date: 2022-04-27 15:53
 * @FilePath: demo  ==> MytestController
 */
@RestController
public class MytestController {

    @Autowired
    public CfgTaskService cfgTaskService;

    @GetMapping("/queryCfgTask")
    public BOcfgTask queryCfgTask(int cfg_task_id) {
        BOcfgTask cfgTask = new BOcfgTask();
        cfgTask = cfgTaskService.selectByPrimaryKey(cfg_task_id);
        return cfgTask;
    }
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

}
