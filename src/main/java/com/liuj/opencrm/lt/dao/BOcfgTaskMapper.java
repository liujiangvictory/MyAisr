package com.liuj.opencrm.lt.dao;

import com.liuj.opencrm.lt.bean.BOcfgTask;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BOcfgTaskMapper {
    int deleteByPrimaryKey(Integer cfg_task_id);

    int insert(BOcfgTask record);

    int insertSelective(BOcfgTask record);

    BOcfgTask selectByPrimaryKey(Integer cfg_task_id);

    int updateByPrimaryKeySelective(BOcfgTask record);

    int updateByPrimaryKey(BOcfgTask record);
}