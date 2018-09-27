package com.springweb.jar.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CustomErrorController implements ErrorController  {
	
	private static final Logger logger = LogManager.getLogger(CustomErrorController.class);
 
    @GetMapping("/error")
    public ModelAndView handleError() throws ServletException, IOException {
    	

    	ModelAndView model = new ModelAndView();
    	model.setViewName("error/error.html");
    	logger.info("model {} ",model);
        return model;
    }
 
    @Override
    public String getErrorPath() {
        return "/error";
    }
}