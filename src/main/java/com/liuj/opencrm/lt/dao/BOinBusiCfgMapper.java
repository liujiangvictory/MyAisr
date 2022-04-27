package com.liuj.opencrm.lt.dao;

import com.liuj.opencrm.lt.bean.BOinBusiCfg;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BOinBusiCfgMapper {
    int deleteByPrimaryKey(Integer busi_id);

    int insert(BOinBusiCfg record);

    int insertSelective(BOinBusiCfg record);

    BOinBusiCfg selectByPrimaryKey(Integer busi_id);

    int updateByPrimaryKeySelective(BOinBusiCfg record);

    int updateByPrimaryKey(BOinBusiCfg record);
}