package com.example.demo.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.RabbitMsg;

//@RestController
public class ProducerController {
	
	protected final String queue = "com.test.queue";
	protected final String route = "com.test.route";
	protected final String exchange = "com.sample";
	
	@Autowired
	private volatile RabbitTemplate rabbitTemplate;
	
	@RequestMapping(value="/sendString",method=RequestMethod.POST)
	public String sendStringMesage(@RequestBody String message ) {
		CorrelationData correlationData=new CorrelationData();
		correlationData.setId("1");
		rabbitTemplate.convertAndSend(exchange,route,message,correlationData);
		return "ok";
	}

	@RequestMapping(value="/sendJson",method=RequestMethod.POST,consumes="application/json")
	public String sendJsonMesage(@RequestBody RabbitMsg message ) {
		CorrelationData correlationData=new CorrelationData();
		correlationData.setId("1");
		rabbitTemplate.convertAndSend(exchange,route,message,correlationData);
		return "ok";
	}
	
	@RequestMapping(value="/sendXml",method=RequestMethod.POST,consumes="application/xml")
	public String sendXmlMesage(@RequestBody RabbitMsg message ) {
		CorrelationData correlationData=new CorrelationData();
		correlationData.setId("1");
		rabbitTemplate.convertAndSend(exchange,route,message,correlationData);
		return "ok";
	}
}
