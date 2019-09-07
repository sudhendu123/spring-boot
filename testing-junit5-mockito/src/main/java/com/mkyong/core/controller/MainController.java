package com.mkyong.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mkyong.core.services.HelloService;

@Controller
public class MainController {
	
	@Autowired
	HelloService service;

    @ResponseBody
    @GetMapping("/")
    public String hello() {
    	String result=service.getString(2, 3);
        return result;
    }

}
