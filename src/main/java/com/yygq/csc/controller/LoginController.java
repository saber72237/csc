package com.yygq.csc.controller;

import com.yygq.csc.bean.AdminDao;
import com.yygq.csc.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    public AdminService adminService;

    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){
        AdminDao adminDao = adminService.findByName(username);
        if(username.equals(adminDao.getAdminName())&&password.equals(adminDao.getAdminPassword())){
            session.setAttribute("loginUser",username);
            session.setAttribute("hostId",adminDao.getHostId());
            return "redirect:/main.html";
        }
        else {
            map.put("msg","用户名密码错误");
            return "redirect:/login/login";
        }
    }
}
