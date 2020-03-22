package com.syntax.class06;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
//		Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad,
//		any other grade --> Not Acceptable. At the end your program should print which grade was entered
//		by a user with explanation.
Scanner input=new Scanner(System.in);
System.out.println("Please enter a grade");
String grade=input.nextLine();
switch (grade) {
case "A":
	grade="Excellent";
	break;
case "B":
	grade="Good";
	break;
case "C":
	grade="Average";
	break;
case "D":
	grade="Bad";
	break;
	default:
		grade="Not Acceptable";
	
}System.out.println("Your grade is "+grade);
	}

}
