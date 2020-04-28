package com.yygq.csc.controller;

import com.yygq.csc.bean.ClassDao;
import com.yygq.csc.bean.SessionDao;
import com.yygq.csc.bean.UserDao;
import com.yygq.csc.service.ClassService;
import com.yygq.csc.service.SessionService;
import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.Collection;

@Controller
public class ClassController {

    @Autowired
    public ClassService classService;

    @Autowired
    public SessionService sessionService;

    @GetMapping(value = "/session")
    public String getSession(HttpSession httpSession, Model model){
        Integer hostId = (Integer) httpSession.getAttribute("hostId");
        Collection<ClassDao> classDao = classService.findByName(hostId);
        model.addAttribute("class",classDao);
        return "emp/session";
    }

    @GetMapping(value = "/class")
    public String getClass(HttpSession httpSession, Model model){
        Integer hostId = (Integer) httpSession.getAttribute("hostId");
        Collection<ClassDao> classDao = classService.findByName(hostId);
        model.addAttribute("class",classDao);
        return "emp/class";
    }

    @GetMapping(value = "/order")
    public String getOrder(HttpSession httpSession, Model model){
        Integer hostId = (Integer) httpSession.getAttribute("hostId");
        Collection<SessionDao> sessionDao = sessionService.findByName(hostId);
        model.addAttribute("orders",sessionDao);
        return "emp/order";
    }
}
