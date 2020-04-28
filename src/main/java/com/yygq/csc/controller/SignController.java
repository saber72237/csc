package com.yygq.csc.controller;

import com.yygq.csc.bean.UserDao;
import com.yygq.csc.service.ClassService;
import com.yygq.csc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Collection;

@Controller
public class SignController {

    @Autowired
    public UserService userService;

    @GetMapping(value = "/lv")
    public String getSign(HttpSession httpSession, Model model){
        Integer hostId = (Integer) httpSession.getAttribute("hostId");
        Collection<UserDao> userDao = userService.findByName(hostId);
        model.addAttribute("sign",userDao);
        System.out.println(model);
        return "emp/lv";
    }
}
