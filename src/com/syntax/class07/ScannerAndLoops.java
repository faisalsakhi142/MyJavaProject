package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoops {

	public static void main(String[] args) {
		//we want to ask user's names 5 times and print good afternoon also 5 times;
//		Scanner input;
//		String name;
//		int num=1;
//		input=new Scanner(System.in);
//		while (num<=5) {
//			System.out.println("What is your name");
//			name=input.nextLine();
//			System.out.println("Good afternoon "+name);
//			num++;
//		}

		
		//we are playing a lottery and a lucky number is 17;
		//we want to keep asking user any number from 1-20 until he guess the lucky number -->Congrats
		Scanner scan = null;
		int luckyNumber=1;
		while(luckyNumber>=20) {
			System.out.println("Please enter a number");
		 luckyNumber=scan.nextInt();
		 luckyNumber++;
		 if(luckyNumber==17) {
			 System.out.println("Congrats");
		 }
		}
	}

}
