package com.rabbbit.mq.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeoutException;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rabbbit.mq.pojo.RabbitMsg;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

@RestController
public class ProducerController {
	
	private static final long msgTTL = 3000;
	protected final String queue = "com.test.queue";
	protected final String route = "com.test.route";
	protected final String exchange = "com.test.exchange";
	
	private static int correlationId=1;
	
	@Autowired
	private volatile RabbitTemplate rabbitTemplate;
	
	
	@RequestMapping(value="/sendString",method=RequestMethod.POST,produces="text/plain")
	public String sendStringMesage(@RequestBody String message ) throws IOException, TimeoutException, KeyManagementException, NoSuchAlgorithmException, URISyntaxException {
		
		ConnectionFactory factory = new ConnectionFactory();
		factory.setUri("amqp://{UI}:{pass}@{host}:{port}");

		Connection conn = (Connection) factory.newConnection();
		Channel channel = conn.createChannel();
		
		channel.basicPublish(exchange, route, getSyncRequestProperties(), message.getBytes());
		
		return "ok";
	}
	
	private AMQP.BasicProperties getSyncRequestProperties()	{
    	AMQP.BasicProperties.Builder rmqbuilder = new AMQP.BasicProperties.Builder();
        rmqbuilder.contentType("text/plain");
        rmqbuilder.contentEncoding("utf-8");
        rmqbuilder.deliveryMode(2);
        rmqbuilder.type("durable");
        rmqbuilder.userId("UI");
        rmqbuilder.correlationId(String.valueOf(correlationId));
        correlationId=correlationId+1;
        //rmqbuilder.expiration(String.valueOf(3000));
    	return rmqbuilder.build();
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
