package com.yygq.csc.controller;

import com.yygq.csc.bean.ActiveDao;
import com.yygq.csc.bean.ClassDao;
import com.yygq.csc.service.ActiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.Collection;

@Controller
public class ActiveController {

    @Autowired
    public ActiveService activeService;

    @GetMapping(value = "/activity")
    public String getSign(HttpSession httpSession, Model model){
        Integer hostId = (Integer) httpSession.getAttribute("hostId");
        Collection<ActiveDao> activeDao = activeService.findByName(hostId);
        model.addAttribute("activities",activeDao);
        return "emp/activity";
    }
}
