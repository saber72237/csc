package com.yygq.csc.controller;

import com.yygq.csc.bean.SignDao;
import com.yygq.csc.bean.UserDao;
import com.yygq.csc.service.SignService;
import com.yygq.csc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Collection;

@Controller
public class UserController {

    @Autowired
    public UserService userService;

    @Autowired
    public SignService signService;

    @GetMapping(value = "/usr")
    public String getSign(HttpSession httpSession, Model model){
        Integer hostId = (Integer) httpSession.getAttribute("hostId");
        Collection<UserDao> userDao = userService.findByName(hostId);
        model.addAttribute("user",userDao);
        return "emp/list";
    }

}
