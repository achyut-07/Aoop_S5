package com.LibraryManagementSystem;

public class Book extends LibraryItem implements Borrowable{
	private String author;

	public Book(String title,String author) {
		super(title);
		this.author=author;
	}

	public String getAuthor() {
		return author;
	}
	@Override
	public void borrowBook(Member member) {
		 if (getisAvailable()) {
	            setAvailable(false);
	            System.out.println(member.getName() + " borrowed the book:- " + getTitle());
	        } 
		 else {
	            System.out.println("Book is not available borrowed by someone else");
	        }
	}

	@Override
	public void returnBook(Member member) {
		setAvailable(true);
		System.out.println(member.getName() + " returned the book:- " + getTitle());
	}

	@Override
	public void displayDetails() {
		System.out.println("Book name:- "+getTitle()+" written by "+getAuthor());
	}

}
