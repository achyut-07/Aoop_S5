package com.GenericStack;
import java.util.*;
public class ArrayStack<T> implements Stack<T> {
	private T[] stack;
    private int top;
    private static final int INITIAL_CAPACITY = 10;
    
    @SuppressWarnings("unchecked")
	public ArrayStack() {
        stack = (T[]) new Object[INITIAL_CAPACITY];
        top = -1; 
    }

	@Override
	public void push(T element) {
		// TODO Auto-generated method stub
		if (top == stack.length - 1) {
            resizeStack(); // Resize if stack is full
        }
        stack[++top] = element;
		
	}

	@Override
	public T pop() {
		  if (isEmpty()) {
	            throw new IllegalStateException("Stack is empty");
	        }
	        T element = stack[top];
	        stack[top--] = null; // Avoid memory leak
	        return element;
	}

	@Override
	public T peek() {
		 if (isEmpty()) {
	            throw new IllegalStateException("Stack is empty");
	        }
	        return stack[top];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}
	
	@SuppressWarnings("unchecked")
    private void resizeStack() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

}
