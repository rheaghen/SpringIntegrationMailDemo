package com.example;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationServiceActivator {
	
	Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@ServiceActivator(inputChannel="notificationsChannel")
	public void process(Message<?> message) throws IOException, MessagingException{
		
//		MimeMessage emailMessage = (MimeMessage) message;
		
		LOGGER.info("******** HEADERS ********");		
		LOGGER.info("{}",message.getHeaders());	
		LOGGER.info("******** PAYLOAD ********");		
		LOGGER.info("{}",message.getPayload());
//		LOGGER.info("******** CONTENT ********");		
//		LOGGER.info("{}",message.6getContent());
	}

}