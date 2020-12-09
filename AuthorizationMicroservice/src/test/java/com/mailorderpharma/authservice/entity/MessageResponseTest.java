package com.mailorderpharma.authservice.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import com.mailorderpharma.authservice.entity.MessageResponse;

public class MessageResponseTest {
	
	MessageResponse msg = new MessageResponse();
	MessageResponse msg1 = new MessageResponse("error",LocalDateTime.now());
	
	@Test
	void testMsg() {
		msg.setMessage("error");
		assertEquals(msg.getMessage(), "error");
	}

	
	@Test
	void testDate() {
		LocalDateTime date = LocalDateTime.now(); 
		msg.setDate(date);
		assertEquals(msg.getDate(), date);
	}

	
	
	
	

}
