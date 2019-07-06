package com.example.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UtilServiceAnsImpl implements UtilService{
	
	private static final Logger logger = LogManager.getLogger(UtilServiceAnsImpl.class);

	String stringVar;
	int intVar;
	
	public UtilServiceAnsImpl() {
		
	}
	
	public UtilServiceAnsImpl(String stringVar, int intVar) {
		this.stringVar=stringVar;
		this.intVar=intVar;
	}
	
	public UtilServiceAnsImpl(int intVar) {
		this.intVar=intVar;
		
	}
	
	@Override
	public String getAns() {
		logger.info("UtilServiceAnsImpl , getAns");
		return stringVar+"UtilServiceAnsImpl"+intVar;
	}

	@Override
	public String getQuestion() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getStringVar() {
		return stringVar;
	}

	public void setStringVar(String stringVar) {
		this.stringVar = stringVar;
	}

	public int getIntVar() {
		return intVar;
	}

	public void setIntVar(int intVar) {
		this.intVar = intVar;
	}

	@Override
	public int add(int a, int b) {
		logger.info("UtilServiceAnsImpl , add");
		return a+a+a;
	}
}
