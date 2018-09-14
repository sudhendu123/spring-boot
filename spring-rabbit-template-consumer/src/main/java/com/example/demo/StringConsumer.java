package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class StringConsumer {

	private static final Logger logger = LoggerFactory.getLogger(StringConsumer.class);
	@RabbitListener(queues = "com.test.queue")
    public void receiveMsg(@Payload  String msg) {
        logger.info("Received msg : {} ", msg);
        
    }
}
