package com.DipMessageprocessingSystem;

public class MainDip {
	
	public static void main(String[] args) {
		MessageService email=new EmailService();
		MyApplication user1=new MyApplication(email);
		user1.processMsg("Hello friends!","FriendEg@gmail.com");
		
		MessageService sms=new SmsService();
		MyApplication user2=new MyApplication(sms);
		user2.processMsg("Hi!","9030816512");
	}

}
