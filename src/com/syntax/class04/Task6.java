package com.syntax.class04;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		//Write a program to ask user to enter numbers of worked years and annual salary.
		//If user worked for more or equals to 5 years than user is eligible for the bonus, 
		//otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000,
		//otherwise bonus=3000.
Scanner input=new Scanner(System.in);
System.out.println("Enter Number of Worked years:");
int Number=input.nextInt();

if(Number>=5) {
	System.out.println("Your eligible for the bonus");

	System.out.println("Enter Your Annual Salary:");
	int Number1=input.nextInt();
	if(Number1>50000) {
		System.out.println("You get 5000 bonus");
	
}else {
	System.out.println("You get 3000 bonus");
}
 }else {
	System.out.println("Sorry, you are not Eligible for Bonus untill you reach");
 }
}
}
