package com.example;

import java.util.HashMap;
import java.util.Map;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.mail.support.DefaultMailHeaderMapper;
import org.springframework.integration.mapping.HeaderMapper;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

@Component("mailMapper")
public class YetAnotherHeaderMapper implements HeaderMapper<MimeMessage>{

	@Autowired
	DefaultMailHeaderMapper mapper;

	@Override
	public void fromHeaders(MessageHeaders headers, MimeMessage target) {
			
		
	}


	@Override
	public Map<String, Object> toHeaders(MimeMessage source) {
		Map<String, Object> result = new HashMap<>();
		result.put("source", source);
		return result;
	}

}