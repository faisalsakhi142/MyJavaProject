package com.syntax.class02;

import java.util.Scanner;

public class ArithmeticOperators {
//	Write a java program that prints out true if ( x * y ) returns a positive value. Else prints out
//	false if  (x * y) returns a negative value. 
//
//	Step 1: Your program should ask "Please enter first number" - for the 1st number and 
//	"Please enter second number" - for the 2nd number.
//
//	Step 2: Create if condition to check if the multiplication of x and y values is positive or negative.
//	If the result of a multiplication is positive print true, otherwise print false.
	public static void main(String[] args){
	    Scanner input=new Scanner (System.in);
	    System.out.println("Please enter first number");
	    int numFirst=input.nextInt();
	    System.out.println("Please enter second number");
	    int numSecond=input.nextInt();
	  // boolean multiplication=input.nextBoolean();
	  // int numberFirst=0;
	   //int numberSecond = 0;
	int mult=numFirst*numSecond;
	  if(numFirst%numSecond==0){
	      System.out.println("True");
	    }else{
	      System.out.println("False");
	    }
	    
	  }
	      
	}
