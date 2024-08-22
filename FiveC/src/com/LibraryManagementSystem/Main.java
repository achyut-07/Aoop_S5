package com.LibraryManagementSystem;

public class Main {
	public static void main(String[] args) {
		Book b1 = new Book("Harry Potter Series Box Set", "J.K. Rowling");
        Book b2 = new Book("The God of Small Things", "Arundhati Roy");
        Member m1 = new Member("Pawan Achyutanand");
        Member m2 = new Member("Anant singh");
        ProcessOfBorrowing p1=new ProcessOfBorrowing(b1);
        p1.borrow(m1);
        p1.returnItem(m1);
        ProcessOfBorrowing p2=new ProcessOfBorrowing(b2);
        p2.borrow(m2);
        p2.returnItem(m2);
	}

}
