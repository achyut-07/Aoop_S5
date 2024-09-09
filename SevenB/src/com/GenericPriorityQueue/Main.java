package com.GenericPriorityQueue;

import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		PriorityQueue<Integer> intQueue = new PriorityQueue<>(Integer::compareTo);
        intQueue.add(15);
        intQueue.add(10);
        intQueue.add(30);
        intQueue.add(20);
        System.out.println("Integer PriorityQueue:");
        System.out.println("Peek: " + intQueue.peek());  
        System.out.println("Poll: " + intQueue.poll());
        System.out.println("Peek after poll: " + intQueue.peek()); 
        
        PriorityQueue<Double> doubleQueue = new PriorityQueue<>(Double::compareTo);
        doubleQueue.add(15.5);
        doubleQueue.add(10.2);
        doubleQueue.add(30.7);
        doubleQueue.add(20.9);
        System.out.println("\nDouble PriorityQueue:");
        System.out.println("Peek: " + doubleQueue.peek());
        System.out.println("Poll: " + doubleQueue.poll());
        System.out.println("Peek after poll: " + doubleQueue.peek());
        
        PriorityQueue<String> stringQueue = new PriorityQueue<>(Comparator.comparingInt(String::length));
        stringQueue.add("apple");
        stringQueue.add("banana");
        stringQueue.add("cherry");
        stringQueue.add("date");
        System.out.println("\nString PriorityQueue (by length):");
        System.out.println("Peek: " + stringQueue.peek());
        System.out.println("Poll: " + stringQueue.poll());
        System.out.println("Peek after poll: " + stringQueue.peek());
	}

}
