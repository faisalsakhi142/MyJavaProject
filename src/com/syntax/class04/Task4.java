package com.syntax.class04;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner DMV=new Scanner(System.in);
 System.out.println("Write your age");
 
 int age=DMV.nextInt();
 if(age>=18) {
	 System.out.println("You will issue driver license for them");
 }else {
	 System.out.println("you will offer them to get a learners permit");
 }

	}
}