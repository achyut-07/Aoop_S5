package com.BoundBufferExp;

public class Consumer implements Runnable{
	
	private BoundedBuffer buffer;

    public Consumer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
            for (int i = 1; i <= 20; i++) { 
                buffer.consume();
                Thread.sleep(500);
            }
        } 
		catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Consumer interrupted.");
        }
	}

}
