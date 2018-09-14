package com.example.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component(value="UtilServiceImplBean")
public class UtilServiceImpl implements UtilService {

	private static final Logger logger = LogManager.getLogger(UtilServiceImpl.class);
	String stringVar;
	int intVar;
	
	public UtilServiceImpl(){
		
	}
	
	public UtilServiceImpl(String stringVar,int intVar){
		this.stringVar=stringVar;
		this.intVar=intVar;
	}
	public UtilServiceImpl(int intVar){
		this.intVar=intVar;
	}
	
	@Override
	public String getAns() {
		logger.info("getAns");
		return stringVar+"UtilServiceImpl"+intVar;
	}
	@Override
	public String getQuestion() {
		return null;
	}
}
