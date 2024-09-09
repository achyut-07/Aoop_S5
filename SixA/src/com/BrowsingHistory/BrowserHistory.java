package com.BrowsingHistory;
import java.util.*;
public class BrowserHistory {
	private Deque<String> backStack; 
    private Deque<String> forwardStack; 
    private String currentPage; 
    public BrowserHistory() {
        backStack = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
        currentPage = null;
    }
    public void visitPage(String page) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = page; 
        forwardStack.clear();
        System.out.println("Visited: " + page);
    }
    
    public void goBack() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Back page: " + currentPage);
        } 
        else{
            System.out.println("No pages to show in the back history.");
        }
    }
    
    public void goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Forward to: " + currentPage);
        } 
        else {
            System.out.println("No pages to show in forward history.");
        }   
    }
    
    public void displayCurrentPage() {
        if (currentPage != null) {
            System.out.println("Current page: " + currentPage);
        } 
        else {
            System.out.println("No pages visited yet.");
        }
    }
    
    



}
