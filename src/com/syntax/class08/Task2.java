package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// Create a program that will be asking user to apply for a credit card 10 times. As soon you
		//get an �yes� from a user program should stop asking.
Scanner input;
String text;
input=new Scanner(System.in);

for(int num=1; num<=10; num++) {
	System.out.println("Apply for the Credit");
	text=input.nextLine();
	if(text.equals("yes")){
	break;
	
		
	}
	
}


	}

}
