package com.BoundBufferExp;

public class Producer implements Runnable {
	private BoundedBuffer buffer;

    public Producer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
	public void run() {
		// TODO Auto-generated method stub
    	try {
            for (int i = 1; i <= 20; i++) { 
                buffer.produce(i);
                Thread.sleep(300);
            }
        } 
    	catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Producer interrupted.");
        }
		
	}

}
