package com.syntax.class07;

import java.util.Scanner;

public class Task1 {
public static void main (String[] args) {
	
		//we are playing a lottery and a lucky number is 17
		//we want to keep asking user any number from 1-20
	    //until he gets the lucky number
	    //until he guesses the lucky number-->congrats

//		Scanner scan=new Scanner(System.in);
//		boolean lucky=true;
//		int num1=0;
//		while(lucky) {
//			System.out.println("Write any number from 1-20");
//			num1=scan.nextInt();
//			if (num1<=1 || num1>=20) {
//				System.out.println("Invalid number");
//			}
//		if (num1==17) {
//				System.out.println("Congrats!");
//				lucky=false;
		//	}
//second and easy way!
		Scanner input;
		int number;
		int luckyNumber=17;
		input=new Scanner(System.in);
		do {
			System.out.println("Please enter any number from 1 to 20");
			number=input.nextInt();
			
		}while(number!=luckyNumber);
		System.out.println("Congrats");
		

}
}