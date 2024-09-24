package com.MessageApplication;
import java.util.concurrent.*;
public class MessageQueue {
	 private BlockingQueue<String> queue = new LinkedBlockingQueue<>();
	 public void produce(String msg) throws InterruptedException {
		 queue.put(msg);
		 System.out.println("Message Produced: " + msg);
	 }
	 
	 public String consume() throws InterruptedException {
		 String msg = queue.take();
		 System.out.println("Consumed the messag: " + msg);
	     return msg;
	 }

}
