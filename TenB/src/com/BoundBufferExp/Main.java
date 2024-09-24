package com.BoundBufferExp;

public class Main {
	public static void main(String[] args) {
		BoundedBuffer buffer = new BoundedBuffer();

        // Create producer and consumer threads
        Thread producerThread = new Thread(new Producer(buffer), "Producer");
        Thread consumerThread = new Thread(new Consumer(buffer), "Consumer");

        // Start the producer and consumer threads
        producerThread.start();
        consumerThread.start();

        // Wait for both threads to complete
        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Producer and Consumer have completed their operations.");
	}

}
