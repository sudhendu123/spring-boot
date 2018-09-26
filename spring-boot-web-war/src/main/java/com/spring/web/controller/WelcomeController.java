package com.spring.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class WelcomeController {
	
	private static final Logger logger = LogManager.getLogger(WelcomeController.class);

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/wel")
	public ModelAndView welcome() {
		ModelAndView model = new ModelAndView();
		model.addObject("message", this.message);
		model.setViewName("/WEB-INF/jsp/welcome.jsp");
		logger.info("welcome");
		return model;
	}
	
	@RequestMapping("/users")
	public void userView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*ModelAndView model = new ModelAndView();
		model.setViewName("/WEB-INF/jsp/User.jsp");*/
		logger.info("userView");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/User.jsp");
        dispatcher.forward(request, response);
		
		//return model;
	}

}