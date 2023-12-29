package com.spring.start.controller;

import com.spring.start.service.StartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {

    @Autowired
    private StartService service;

    @RequestMapping("/")
    public String home() {

        service.getDB();

        return "index";
    }

}
