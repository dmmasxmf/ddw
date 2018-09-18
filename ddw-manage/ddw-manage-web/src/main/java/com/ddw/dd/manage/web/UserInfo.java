package com.ddw.dd.manage.web;

import com.ddw.dd.manage.pojo.po.Admin;
import com.ddw.dd.manage.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 登录的验证
 * User: dmm
 * Date: 2018/9/3 0003
 * Time: 下午 8:09
 * Version:V1.0
 */
@Controller
public class UserInfo {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){

        System.out.println("-----------------------------------------------+++++++++++++++++++++++");
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/check",method = RequestMethod.GET)
    public String check(Admin admin){
        System.out.println("dfwcghbjnkmvgdbwhnj");
        Admin findAdmin=adminService.findAdmin(admin);
        if(findAdmin!=null){
            if (admin.getPassword().equals(findAdmin.getPassword())){
                return "1";
            }
            return "0";
        }
        System.out.println(admin.getUsername()+"--------------------------------------------");
        return "0";
    }
}
