package com.MessageApplication;

public class MainDemo {
	public static void main(String[] args) {
		MessageQueue msgQ = new MessageQueue();
		Thread producerThread = new Thread(new Producer(msgQ), "Producer");
        Thread consumerThread = new Thread(new Consumer(msgQ), "Consumer");
        producerThread.start();
        consumerThread.start();
        try {
            producerThread.join();
            consumerThread.join();
        } 
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        
        System.out.println("Message exchange completed.");
	}

}
