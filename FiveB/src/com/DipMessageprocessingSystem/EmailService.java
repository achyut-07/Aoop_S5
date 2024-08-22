package com.DipMessageprocessingSystem;

public class EmailService implements MessageService{

	@Override
	public void sendMessage(String msg, String recipient) {
		System.out.println("Email sent to "+recipient+" whith a message "+msg);
	}
	
}
