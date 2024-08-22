package com.LibraryManagementSystem;

public class ProcessOfBorrowing {
	private Borrowable item;
	public ProcessOfBorrowing(Borrowable item) {
        this.item = item;
    }
	
	public void borrow(Member member) {
        item.borrowBook(member);
    }

    public void returnItem(Member member) {
        item.returnBook(member);
    }

	
}
