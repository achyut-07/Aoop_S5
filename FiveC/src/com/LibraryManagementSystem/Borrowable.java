package com.LibraryManagementSystem;

public interface Borrowable {
	void borrowBook(Member member);
	void returnBook(Member member);

}
