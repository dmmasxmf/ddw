package com.ddw.dd.manage.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 正常的页面跳转
 * User: Dmm
 * Date: 2018/9/3 0003
 * Time: 下午 5:55
 * Version:V1.0
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/{login}",method = RequestMethod.GET)
    public String getLogin(@PathVariable String login){

        return login;
    }

}
