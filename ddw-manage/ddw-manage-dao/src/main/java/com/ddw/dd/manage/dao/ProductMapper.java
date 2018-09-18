package com.ddw.dd.manage.dao;

import com.ddw.dd.manage.pojo.po.Product;
import com.ddw.dd.manage.pojo.po.ProductWithBLOBs;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductWithBLOBs record);

    int insertSelective(ProductWithBLOBs record);

    ProductWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProductWithBLOBs record);

    int updateByPrimaryKey(Product record);
}