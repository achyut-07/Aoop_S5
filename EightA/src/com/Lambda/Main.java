package com.Lambda;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Apple");
		al.add("Banana");
		al.add("Cherry");
		al.add("Mango");
		al.add("WaterMelon");
		al.sort((s1, s2) -> s2.compareTo(s1));
		System.out.println(al);
	}

}
