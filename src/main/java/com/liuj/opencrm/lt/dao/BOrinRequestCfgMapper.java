package com.liuj.opencrm.lt.dao;

import com.liuj.opencrm.lt.bean.BOrinRequestCfg;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BOrinRequestCfgMapper {
    int deleteByPrimaryKey(Integer busi_id);

    int insert(BOrinRequestCfg record);

    int insertSelective(BOrinRequestCfg record);

    BOrinRequestCfg selectByPrimaryKey(Integer busi_id);

    int updateByPrimaryKeySelective(BOrinRequestCfg record);

    int updateByPrimaryKey(BOrinRequestCfg record);
}