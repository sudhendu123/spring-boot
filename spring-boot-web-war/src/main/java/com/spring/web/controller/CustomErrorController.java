package com.spring.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CustomErrorController implements ErrorController  {
	
	private static final Logger logger = LogManager.getLogger(CustomErrorController.class);
 
    @GetMapping("/error")
    public ModelAndView handleError(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	Integer statusCode =null;
    	String viewName="/WEB-INF/jsp/error/error.jsp";
    	Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
    	if (status != null) {
            statusCode = Integer.valueOf(status.toString());
            logger.info("status : {} : {}",status,statusCode);
    	}
    	
    	ModelAndView model = new ModelAndView();
    	if(statusCode == HttpStatus.NOT_FOUND.value()) {
            viewName="/WEB-INF/jsp/error/404.jsp";
        }/*else {
        	
        }*/
    	model.setViewName(viewName);
    	logger.info("handleError in :{} :{}",request.getContextPath(),model);
        return model;
    	/*RequestDispatcher dispatcher = request.getRequestDispatcher("\\error.html");
        dispatcher.forward(request, response);*/
    }
 
    @Override
    public String getErrorPath() {
        return "/error";
    }
}