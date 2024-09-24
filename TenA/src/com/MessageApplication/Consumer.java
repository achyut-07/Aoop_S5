package com.MessageApplication;

public class Consumer implements Runnable{
	
	private MessageQueue msgQ;

    public Consumer(MessageQueue messageQueue) {
        this.msgQ=messageQueue;
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
            for (int i = 1; i <= 5; i++) {
            	msgQ.consume();

                Thread.sleep(1000);
            }
        } 
		catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Consumer interrupted.");
        }
	}

}
