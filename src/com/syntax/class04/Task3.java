package com.syntax.class04;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner amount=new Scanner(System.in);
		System.out.println("What is the amount of loan is needed?");
		int num=amount.nextInt();
		
		if(num<=200000) {
			System.out.println("You would lend the money");
		}else {
			System.out.println("You would reject the client.");
		}
		
	
		

	}

}
