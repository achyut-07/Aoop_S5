package com.MessageApplication;

public class Producer implements Runnable {
	
	private MessageQueue msgQ;
	
	public Producer(MessageQueue messageQueue) {
        this.msgQ = messageQueue;
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
            try {
                String message = "Message " + i;
                msgQ.produce(message);

                Thread.sleep(500);
            } 
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer interrupted.");
            }
        }
		
	}

}
