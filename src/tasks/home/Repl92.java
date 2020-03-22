package tasks.home;

import java.util.Scanner;

public class Repl92 {
//	For you to do:
//
//		Using Scanner class input string value. 
//		Print out the following: "The first 3 letters of ___ is ___"
//
//		For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
	
	  public static void main(String[] args) {
		  Scanner input=new Scanner (System.in);

		 		String name=input.nextLine();

		 		String newName=name.substring(0, 3);

		 		System.out.println("The first 3 letters of "+ name +" is "+newName);

		 	}

		 }