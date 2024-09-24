package com.BoundBufferExp;

import java.util.concurrent.*;

public class BoundedBuffer {
	private BlockingQueue<Integer> queue;
	
	public BoundedBuffer() {
        this.queue = new LinkedBlockingQueue<>(10);  // Capacity is set to 10
    }
	
	public void produce(int item) throws InterruptedException {
        queue.put(item);  
        System.out.println("Produced: " + item);
    }
	
	public int consume() throws InterruptedException {
        int item = queue.take();
        System.out.println("Consumed: " + item);
        return item;
    }

}
