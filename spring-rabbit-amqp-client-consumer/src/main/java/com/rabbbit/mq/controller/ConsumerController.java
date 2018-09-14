package com.rabbbit.mq.controller;

import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rabbbit.mq.consumer.StringConsumer;

@RestController
public class ConsumerController {

	
	@Autowired
	StringConsumer stringCon;
	
	@RequestMapping(value="/consume",method=RequestMethod.GET)
	public String consumeMsg() {
		stringCon.StringConsumers();
		
		return "OK";
	}
	
	@RequestMapping(value="/getMsg",method=RequestMethod.GET)
	public ConcurrentHashMap<String,Object> getMsg() {
		ConcurrentHashMap<String, Object> res = stringCon.getMessages();
		
		return res;
	}
}
