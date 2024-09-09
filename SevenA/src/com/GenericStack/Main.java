package com.GenericStack;
public class Main {
	
	public static void main(String[] args) {
		Stack<Integer> intLinkedListStack = new LinkedListStack<>();
        intLinkedListStack.push(10);
        intLinkedListStack.push(20);
        System.out.println("Peek: " + intLinkedListStack.peek());
        System.out.println("Pop: " + intLinkedListStack.pop()); 
        System.out.println("Peek: " + intLinkedListStack.peek());

        
        Stack<String> stringArrayStack = new ArrayStack<>();
        stringArrayStack.push("Hello");
        stringArrayStack.push("AOOP");
        System.out.println("Array Stack- Peek: " + stringArrayStack.peek()); 
        System.out.println("Array Stack- Pop: " + stringArrayStack.pop());   
        System.out.println("Array Stack- Peek: " + stringArrayStack.peek()); 

        
        Stack<Character> charLinkedListStack = new LinkedListStack<>();
        charLinkedListStack.push('A');
        charLinkedListStack.push('B');
        System.out.println("LinkedList Stack - Peek: " + charLinkedListStack.peek());
        System.out.println("LinkedList StacK - Pop: " + charLinkedListStack.pop());
        System.out.println("LinkedList Stack - Peek: " + charLinkedListStack.peek()); 
    
	}

}
