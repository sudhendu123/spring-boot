package com.springweb.jar.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.ModelAndView;

import com.springweb.jar.model.User;

@Controller
public class DashboardController {

	@RequestMapping(value = "/testapp", method = RequestMethod.GET)
	public ModelAndView testApp(HttpServletRequest req,HttpServletResponse resp ) {
		String sessionId = RequestContextHolder.currentRequestAttributes().getSessionId();
		
		req.getSession(true);
		String sessionId1 = RequestContextHolder.currentRequestAttributes().getSessionId();
		System.out.println(sessionId +":"+sessionId1);
		if ((!req.isRequestedSessionIdValid()) && (req.getRequestedSessionId() != null)) {
		      HttpSession s = req.getSession(false);
		      if (s != null) {
		           s.invalidate();
		      }}
		ModelAndView model = new ModelAndView();
    	model.setViewName("welcome.html");
		return model;
		
	}
	
	@RequestMapping(value = "/corsTest", method = RequestMethod.GET)
	public ModelAndView corsTest(HttpServletRequest req,HttpServletResponse resp ) {
		
		return new ModelAndView("corsTestView.html");
	}
    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public ModelAndView dashboard() {
    	ModelAndView model = new ModelAndView();
    	model.addObject("users", getUsers());
    	model.setViewName("dashboard.jsp");
    	return model;
    }

	private List<User> getUsers() {
		User user = new User();
		user.setEmail("johndoe123@gmail.com");
		user.setName("John Doe");
		user.setAddress("Bangalore, Karnataka");
		User user1 = new User();
		user1.setEmail("amitsingh@yahoo.com");
		user1.setName("Amit Singh");
		user1.setAddress("Chennai, Tamilnadu");
		User user2 = new User();
		user2.setEmail("bipulkumar@gmail.com");
		user2.setName("Bipul Kumar");
		user2.setAddress("Bangalore, Karnataka");
		User user3 = new User();
		user3.setEmail("prakashranjan@gmail.com");
		user3.setName("Prakash Ranjan");
		user3.setAddress("Chennai, Tamilnadu");
		return Arrays.asList(user, user1, user2, user3);
	}

}
