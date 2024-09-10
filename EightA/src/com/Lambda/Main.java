package com.Lambda;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Audi");
		al.add("BMW");
		al.add("Citorgen");
		al.add("Mahindra");
		al.add("Volkswagen");
		al.sort((s1, s2) -> s2.compareTo(s1));
		System.out.println(al);
	}

}
