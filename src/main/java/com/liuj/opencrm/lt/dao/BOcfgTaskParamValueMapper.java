package com.liuj.opencrm.lt.dao;

import com.liuj.opencrm.lt.bean.BOcfgTaskParamValue;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BOcfgTaskParamValueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BOcfgTaskParamValue record);

    int insertSelective(BOcfgTaskParamValue record);

    BOcfgTaskParamValue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BOcfgTaskParamValue record);

    int updateByPrimaryKey(BOcfgTaskParamValue record);
}