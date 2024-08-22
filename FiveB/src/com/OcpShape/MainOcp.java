package com.OcpShape;

public class MainOcp {
	public static void main(String[] args) {
		Shape rectangle=new Rectangle(20,12.5);
		Shape circle=new Circle(7.5);
		System.out.println("Area of rectangle is:- "+rectangle.calculateArea());
		System.out.println("Area of circle is:- "+circle.calculateArea());
	}

}
