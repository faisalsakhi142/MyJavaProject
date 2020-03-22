package tasks.home;

import java.util.Scanner;

public class Repl94 {
	
//	For you to do:
//
//		If browser is ChRoME it should print the: 
//		"Proceed with Chrome browser"
//
//		If browser is FireFOX it should print the: 
//		"Proceed with Firefox browser"
//
//		If browser is IE it should print the:
//		"Proceed with IE browser"
//
//		If any other browser it should print the:  
//		"Invalid browser"
	
	
	 public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in); 
		    System.out.println("Enter the browser name to proceed further with execution");
		    String browser = sc.nextLine(); 
		    if(browser.contentEquals("Chrome")) {
		    	System.out.println("Proceed with Chrome browser");
		    }else if(browser.equalsIgnoreCase("FireFOX")) {//we can also use ignore case for the upper/lower case
		    	System.out.println("Proceed with FireFOX browser");
		    }else if(browser.contentEquals("IE")) {
				    	System.out.println("Proceed with IE browser");
				    }else {
				    	System.out.println("Invalid browser");
				    }
		    
	 }
		  }
		


