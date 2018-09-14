package com.example.demo;

import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;


@Component
public class ScheduledTasks {

    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    
    protected final String queue = "com.test.queue";
	protected final String route = "com.test.route";
	protected final String exchange = "com.test.exchange";
	
    @Autowired
	private volatile RabbitTemplate rabbitTemplate;

	private final AtomicInteger counter = new AtomicInteger();
	
	//@Scheduled(fixedRate = 3000)
	public String StringConsumers() {
		String tag =null;
		try {
			ConnectionFactory factory = new ConnectionFactory();
			factory.setUri("amqp://UI:PASS@host:port");

			Connection conn = (Connection) factory.newConnection();
			Channel channel = conn.createChannel();
			
			//channel.exchangeDeclare(exchange, "direct", true);
			//channel.queueDeclare(queue,true,false,false,null) ;
			channel.queueBind(queue, exchange, route);

			//Consumer cons =channel.getDefaultConsumer();
			//tag = channel.basicConsume(queue, true,channel.getDefaultConsumer());
			
			Consumer consumer = new DefaultConsumer(channel) {
	            @Override
				public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties,
						byte[] body) throws UnsupportedEncodingException  {
	                String message = new String(body, "UTF-8");
	                System.out.println("ReceiveLogsTopic2 Received '" + envelope.getRoutingKey() + "':'" + message + "'");
	            }
	        };
	        tag =channel.basicConsume(queue, true, consumer);
	        
			System.out.println("tag: "+tag);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tag;
	}

  @Scheduled(fixedRate = 2000)
    public void scheduleTaskWithFixedRate() {
        logger.info("Fixed Rate Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()) );
        //rabbitTemplate.convertAndSend("com.test.queue","Hello World " + counter.incrementAndGet());
        String correlationId = String.valueOf(counter.incrementAndGet());
        Message message = MessageBuilder.withBody("valid message".getBytes())
                .setDeliveryMode(MessageDeliveryMode.PERSISTENT)
                .build();

        //rabbitTemplate.convertAndSend("com.sample", "com.test.route", message, new CorrelationData(correlationId));
        //rabbitTemplate.convertAndSend("com.sample", "com.test.route", "message "+ counter.incrementAndGet());
        //rabbitTemplate.convertAndSend("message "+correlationId ,correlationId);
        rabbitTemplate.convertAndSend("message "+correlationId);
    }
    
	/*@RabbitListener(queues = "com.test.queue")
    public void receiveMsg(String msg) {
        logger.info("Received msg : {} ", msg);
        
    }*/

    /*@Scheduled(fixedDelay = 2000)
    public void scheduleTaskWithFixedDelay() {
        logger.info("Fixed Delay Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ex) {
            logger.error("Ran into an error {}", ex);
            throw new IllegalStateException(ex);
        }
    }

    @Scheduled(fixedRate = 2000, initialDelay = 5000)
    public void scheduleTaskWithInitialDelay() {
        logger.info("Fixed Rate Task with Initial Delay :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
    }

    @Scheduled(cron = "0 * * * * ?")
    public void scheduleTaskWithCronExpression() {
        logger.info("Cron Task :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
    }*/

}
