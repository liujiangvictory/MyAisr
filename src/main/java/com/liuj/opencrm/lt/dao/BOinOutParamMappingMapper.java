package com.liuj.opencrm.lt.dao;

import com.liuj.opencrm.lt.bean.BOinOutParamMapping;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BOinOutParamMappingMapper {
    int insert(BOinOutParamMapping record);

    int insertSelective(BOinOutParamMapping record);
}