package com.rabbbit.mq.consumer;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.Envelope;
import com.rabbitmq.client.ShutdownSignalException;

@Component
//@Scope("prototype")
public class MessageConsumer implements Consumer {
	
	Channel channel=null;
	
	/*@Autowired
	public MessageConsumer(Channel channel) {
		this.channel=channel;
	}*/
	
	private static ConcurrentHashMap<String, Object> dataStore = new ConcurrentHashMap<String, Object>() ;
	
	public static ConcurrentHashMap<String, Object> getDataStore() {
		return dataStore;
	}

	public static void setDataStore(ConcurrentHashMap<String, Object> dataStore) {
		MessageConsumer.dataStore = dataStore;
	}

	@Override
	public void handleConsumeOk(String consumerTag) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCancelOk(String consumerTag) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCancel(String consumerTag) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleDelivery(String arg0, Envelope envelop, BasicProperties prop, byte[] body) throws IOException {
		String msg = new String(body, "UTF-8");
		dataStore.put(prop.getCorrelationId(), msg);
		System.out.println("msg :"+msg);
		System.out.println("envelop :"+envelop);
		
		channel.basicAck(envelop.getDeliveryTag(), false);
		//throw new IOException("hello excep");
		//channel.basicNack(envelop.getDeliveryTag(), false, false);
        //channel.basicReject(envelop.getDeliveryTag(), false);
		
	}

	@Override
	public void handleShutdownSignal(String consumerTag, ShutdownSignalException sig) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleRecoverOk(String consumerTag) {
		// TODO Auto-generated method stub
		
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	
	
}
