package it.Repl;

import java.util.Scanner;

public class ScannerClass24 {
//	For you to do:
//		Write a program that takes a user's name and prints it. 
//
//		Example Output:
//		Hello, please enter your name
//		Your name is Sumair
	  public static void main (String[] args){
		  Scanner input=new Scanner(System.in);  
		  System.out.println("Hello, Please enter your name");
		  String name=input.nextLine();
		  System.out.println("Your name is "+name);
		      
		    }
		  }