package com.jms;

import org.apache.activemq.ActiveMQConnectionFactory;
import javax.jms.Connection;
import javax.jms.JMSException;

public class JMSConnectionFactory {
	
	public static ActiveMQConnectionFactory connectionFactory = null;
	
	public static Connection connection = null;
	
	static {
		String url = ActiveMQConnectionFactory.DEFAULT_BROKER_URL;
		System.out.println("url:" + url);
		connectionFactory = new ActiveMQConnectionFactory(url);
		try {
			connection = connectionFactory.createConnection();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Connection getJMSConnection() {
		return connection;
	}
	
	

}
