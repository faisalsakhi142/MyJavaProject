package it.Repl;

import java.util.Scanner;

public class ScannerClass21 {
//	For you to do: 
//		Write a program that asks the user's age: "Enter your age  "
//		Then display it by adding 10 (i.e age + 10) in your final output. 
//
//		Example Output: 
//		Enter your age 30
//		Your age after 10 years is 40
	public static void main(String[] args) {
		
		
			
			Scanner age=new Scanner(System.in);
			System.out.println("Enter Your Age");
			int age1=age.nextInt();
			System.out.println("Your age after"+" 10 years "+"is "+(age1+10));
			

	}

}
