package com.NumberPrinter;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DivisibleNumber {
	private static int currentNumber = 1;
    private static final int MAX_NUMBER = 15;
    private static final Lock lock = new ReentrantLock();

    public static void main(String[] args) {

        Thread t1 = new Thread(DivisibleNumber::printTwo);
        Thread t2 = new Thread(DivisibleNumber::printThree);
        Thread t3 = new Thread(DivisibleNumber::printFour);
        Thread t4 = new Thread(DivisibleNumber::printFive);
        Thread t5 = new Thread(DivisibleNumber::printNumber);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    public static void printTwo() {
        while (true) {
            lock.lock();
            try {
                if (currentNumber > MAX_NUMBER) return;
                if (currentNumber % 2 == 0 && currentNumber % 3 != 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
                    System.out.println(currentNumber+" is divisible by 2");
                    currentNumber++;
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public static void printThree() {
        while (true) {
            lock.lock();
            try {
                if (currentNumber > MAX_NUMBER) return;
                if (currentNumber % 3 == 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
                    System.out.println(currentNumber+" is divisible by 3");
                    currentNumber++;
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public static void printFour() {
        while (true) {
            lock.lock();
            try {
                if (currentNumber > MAX_NUMBER) return;
                if (currentNumber % 4 == 0 && currentNumber % 5 != 0) {
                    System.out.println(currentNumber+" is divisible by 4");
                    currentNumber++;
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public static void printFive() {
        while (true) {
            lock.lock();
            try {
                if (currentNumber > MAX_NUMBER) return;
                if (currentNumber % 5 == 0) {
                    System.out.println(currentNumber+" is divisible by 5");
                    currentNumber++;
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public static void printNumber() {
        while (true) {
            lock.lock();
            try {
                if (currentNumber > MAX_NUMBER) return;
                if (currentNumber % 2 != 0 && currentNumber % 3 != 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
                    System.out.println("Number: " + currentNumber);
                    currentNumber++;
                }
            } finally {
                lock.unlock();
            }
        }
    }

}
