package com.ddw.dd.manage.service.impl;

import com.ddw.dd.manage.dao.AdminMapperCustom;
import com.ddw.dd.manage.pojo.po.Admin;
import com.ddw.dd.manage.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: Administrator
 * Date: 2018/9/3 0003
 * Time: 下午 10:07
 * Version:V1.0
 * @author DMM
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapperCustom mapperCustom;

    @Override
    public Admin findAdmin(Admin admin) {

        System.out.println(admin.getUsername()+admin.getPassword()+"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        Admin findAdmin=mapperCustom.selectByUsername(admin);

        System.out.println(findAdmin+"-----------------------");

        return findAdmin;
    }
}
