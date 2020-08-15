package com.example.controller;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dto.Users;
import com.example.repo.UserDAOImpl;

@Component
//@WebService(serviceName = "GoodSoap", targetNamespace = "/GoodSoap_V1.0", portName = "Port")
//@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class SoapController {
	private static final Logger logger = LogManager.getLogger(SoapController.class);
	
	@Autowired
	private UserDAOImpl userRepo;
	
	@WebMethod(action = "createUser")
	@WebResult(name = "result")
	public Users createUser(@WebParam(name = "user") Users user) {
		logger.info("createUser ()",user);
		userRepo.insert(user);
		logger.info("createUser created");
		return user;
		
	}
	
	@WebMethod(action = "getUser")
	@WebResult(name = "result")
	public Users getUser(@WebParam(name = "userId")long userId) {
		logger.info("getUser "+userId);
		Users user = userRepo.findById(userId);
		logger.info("getUser "+user);
		return user;
	}
	
	@WebMethod(action = "getAllUser")
	@WebResult(name = "result")
	public List<Users> getAllUser() {
		List<Users> user = userRepo.findAll();
		return user;
	}
	
	@WebMethod(action = "deletetUser")
	@WebResult(name = "result")
	public int deletetUser(@WebParam(name = "userId")long userId) {
		logger.info("deletetUser ()",userId);
		int delCount= userRepo.deleteById(userId);
		return delCount;
	} 

	@WebMethod(action = "updateUser")
	@WebResult(name = "result")
	public Users updateUser(@WebParam(name = "user") Users user) {
		logger.info("updateUser ()",user);
		userRepo.update(user);
		return user;
		
	}
}
