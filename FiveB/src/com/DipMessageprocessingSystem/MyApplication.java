package com.DipMessageprocessingSystem;

public class MyApplication {
	private MessageService msgs;
	public MyApplication(MessageService msgs) {
		this.msgs=msgs;
	}
	
	public void processMsg(String msg,String recipient) {
		msgs.sendMessage(msg, recipient);
	}

}
