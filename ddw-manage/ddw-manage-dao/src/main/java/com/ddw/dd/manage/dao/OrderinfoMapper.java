package com.ddw.dd.manage.dao;

import com.ddw.dd.manage.pojo.po.Orderinfo;

public interface OrderinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Orderinfo record);

    int insertSelective(Orderinfo record);

    Orderinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orderinfo record);

    int updateByPrimaryKeyWithBLOBs(Orderinfo record);

    int updateByPrimaryKey(Orderinfo record);
}