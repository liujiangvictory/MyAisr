package com.liuj.opencrm.lt.dao;

import com.liuj.opencrm.lt.bean.BOinResponseCfg;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BOinResponseCfgMapper {
    int deleteByPrimaryKey(Integer busi_id);

    int insert(BOinResponseCfg record);

    int insertSelective(BOinResponseCfg record);

    BOinResponseCfg selectByPrimaryKey(Integer busi_id);

    int updateByPrimaryKeySelective(BOinResponseCfg record);

    int updateByPrimaryKey(BOinResponseCfg record);
}