package com.ddw.dd.manage.dao;

import com.ddw.dd.manage.pojo.po.Payinfo;

public interface PayinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Payinfo record);

    int insertSelective(Payinfo record);

    Payinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Payinfo record);

    int updateByPrimaryKey(Payinfo record);
}