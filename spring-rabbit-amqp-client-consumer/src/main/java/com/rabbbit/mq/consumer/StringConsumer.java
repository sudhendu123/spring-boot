package com.rabbbit.mq.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;

@Component
public class StringConsumer {
	
	protected final String queue = "com.test.queue";
	protected final String route = "com.test.route";
	protected final String exchange = "com.test.exchange";
	protected final String deadLetterExchange = "com.sample.deadletter";
	protected final String deadLetterRoute = "com.sample.deadletter.route";
	
	@Autowired
	MessageConsumer messageConsumer;
	
	private static int count=1;
	public void StringConsumers() {
		try {
			ConnectionFactory factory = new ConnectionFactory();
			factory.setUri("amqp://{UI}:{pass}@{host}:{port}");

			Connection conn = (Connection) factory.newConnection();
			Channel channel = conn.createChannel();
			
			Map<String, Object> args = new HashMap<String, Object>();
			args.put("x-dead-letter-exchange", deadLetterExchange);
			args.put("x-dead-letter-routing-key",deadLetterRoute);
			
			channel.exchangeDeclare(exchange, "direct", true);
			channel.queueDeclare(queue,true,false,false,args) ;
			channel.queueBind(queue, exchange, route);

			//Consumer cons =channel.getDefaultConsumer();
			//tag = channel.basicConsume(queue, true,channel.getDefaultConsumer());
			
			/*Consumer consumer = new DefaultConsumer(channel) {
	            @Override
				public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties,
						byte[] body) throws UnsupportedEncodingException  {
	                String message = new String(body, "UTF-8");
	                System.out.println("Received '" + envelope.getRoutingKey() + "':'" + message + "'");
	            }
	        };*/
			//MessageConsumer messageConsumer=new MessageConsumer(channel);
			messageConsumer.setChannel(channel);
			Consumer consumer=messageConsumer; 
	        String tag = channel.basicConsume(queue, false, consumer);
	        System.out.println("tag :"+tag);
	        
	        //channel.basicNack(deliveryTag, multiple, requeue);
	        //channel.basicReject(count, false);
	        //count=count+1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public ConcurrentHashMap<String,Object> getMessages() {
		return messageConsumer.getDataStore();
	}
	
	private Map<String, Object> getSyncRequestProperties()	{
    	AMQP.BasicProperties.Builder rmqbuilder = new AMQP.BasicProperties.Builder();
        rmqbuilder.contentType("text/plain");
        rmqbuilder.contentEncoding("utf-8");
        rmqbuilder.deliveryMode(2);
        rmqbuilder.correlationId("1");
        rmqbuilder.type("sync-request");
        rmqbuilder.userId("UI");
        //rmqbuilder.expiration(String.valueOf(3000));
    	return null;
    }

}
