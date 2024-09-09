package com.MinMaxArray;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Integer[] intArray = {3, 9, 2, 8, 6, 4};
        MaxMinFinder<Integer> intFinder = new MaxMinFinder<>();
        System.out.println("Integer Array: " + Arrays.toString(intArray));
        System.out.println("Max: " + intFinder.findMax(intArray));
        System.out.println("Min: " + intFinder.findMin(intArray));
        
        Float[] floatArray = {3.2f, 9.8f, 2.1f, 8.6f, 6.3f, 4.5f};
        MaxMinFinder<Float> floatFinder = new MaxMinFinder<>();
        System.out.println("\nFloat Array: " + Arrays.toString(floatArray));
        System.out.println("Max: " + floatFinder.findMax(floatArray));
        System.out.println("Min: " + floatFinder.findMin(floatArray));
        
        String[] stringArray = {"apple", "orange", "banana", "kiwi"};
        MaxMinFinder<String> stringFinder = new MaxMinFinder<>();
        System.out.println("\nString Array: " + Arrays.toString(stringArray));
        System.out.println("Max: " + stringFinder.findMax(stringArray));
        System.out.println("Min: " + stringFinder.findMin(stringArray));
        
        Character[] charArray = {'a', 'z', 'm', 'b'};
        MaxMinFinder<Character> charFinder = new MaxMinFinder<>();
        System.out.println("\nCharacter Array: " + Arrays.toString(charArray));
        System.out.println("Max: " + charFinder.findMax(charArray));
        System.out.println("Min: " + charFinder.findMin(charArray));
	}

}
