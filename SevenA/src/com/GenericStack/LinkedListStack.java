package com.GenericStack;
import java.util.*;
class LinkedListStack<T> implements Stack<T> {
    private LinkedList<T> stack;

    public LinkedListStack() {
        stack = new LinkedList<>();
    }

   
    @Override
    public void push(T element) {
        stack.push(element); 
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.pop(); 
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.peek();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}