package com.ddw.dd.manage.service;

import com.ddw.dd.manage.pojo.po.Admin;

/**
 * 后台管理的用户
 * User: Dmm
 * Date: 2018/9/3 0003
 * Time: 下午 9:45
 * Version:V1.0
 * @author Dmm
 */
public interface AdminService {

    /**
     * 登录查询用户
     * @param admin
     * @return
     */
    public Admin findAdmin(Admin admin);


}
