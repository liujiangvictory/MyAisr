package com.liuj.opencrm.lt.dao;

import com.liuj.opencrm.lt.bean.BOinTemplate;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BOinTemplateMapper {
    int insert(BOinTemplate record);

    int insertSelective(BOinTemplate record);
}