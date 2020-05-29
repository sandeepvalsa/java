package com.test;

import java.util.Calendar;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

import com.jms.JMSConnectionFactory;

public class TestClient {

	public static void main(String[] args) throws JMSException {

		Connection connection = JMSConnectionFactory.getJMSConnection();
		System.out.println(connection.toString());
		Session session  = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
		Destination destination = session.createQueue("TestQueue1");
		MessageProducer producer = session.createProducer(destination);
		while(true) {
		TextMessage text = 	session.createTextMessage(Calendar.getInstance().getTime().toGMTString());
		producer.send(text);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}

}
