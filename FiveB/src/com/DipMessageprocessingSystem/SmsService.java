package com.DipMessageprocessingSystem;

public class SmsService implements MessageService{

	@Override
	public void sendMessage(String msg, String recipient) {
		// TODO Auto-generated method stub
		System.out.println("SMS delivered to "+recipient+" with your message:-  "+msg);
	}

}
