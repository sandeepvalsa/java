package com.test;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import com.jms.JMSConnectionFactory;

public class TestReceiver {

	public static void main(String[] args) {
		
		try {
			Connection connection = JMSConnectionFactory.getJMSConnection();
			System.out.println(connection.toString());
			Session session  = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
			Destination destination = session.createQueue("TestQueue1");
			MessageConsumer consumer = session.createConsumer(destination); 
			connection.start();
			while(true) 
			{
			TextMessage text  = (TextMessage) consumer.receive();
			System.out.println("message:" + text.getText());
			}
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
