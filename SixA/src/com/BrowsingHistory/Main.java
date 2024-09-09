package com.BrowsingHistory;

public class Main {
	public static void main(String[] args) {
        BrowserHistory bH = new BrowserHistory();
        
        bH.visitPage("google.com");
        bH.visitPage("stackoverflow.com");
        bH.visitPage("github.com");
      
        
        bH.displayCurrentPage();
        
        bH.goBack();
        bH.displayCurrentPage();
        
        bH.goBack();
        bH.displayCurrentPage();
        
        bH.goForward();
        bH.displayCurrentPage();
    }

}
