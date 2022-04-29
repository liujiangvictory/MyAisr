package com.liuj.opencrm.lt.Test;

import com.liuj.opencrm.lt.generator.entity.CfgTask;
import com.liuj.opencrm.lt.generator.mapper.CfgTaskMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Title:
 * @author: Liu jiang
 * @Date: 2022-04-29 14:12
 * @FilePath: demo  ==> TestDemo
 */
@SpringBootTest
public class TestDemo {

    @Autowired
    private CfgTaskMapper cfgTaskMapper;

    @Test
    void contextLoads(){
        //参数是一个Mapper,条件构造器，这里我们先不用null
        //查询所有的用户
        List<CfgTask> cfgTasks = cfgTaskMapper.selectList(null);
        cfgTasks.forEach(System.out::println);
    }
}
