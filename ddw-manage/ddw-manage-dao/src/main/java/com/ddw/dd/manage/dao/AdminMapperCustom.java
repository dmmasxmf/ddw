package com.ddw.dd.manage.dao;

import com.ddw.dd.manage.pojo.po.Admin;
import org.apache.ibatis.annotations.Param;

/**
 * @author dmm
 */

public interface AdminMapperCustom {

    /**
     * 验证是否正确
     * @param admin
     * @return
     */
    public Admin selectByUsername(@Param("admin") Admin admin);
}