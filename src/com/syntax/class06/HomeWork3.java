package com.syntax.class06;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
//		Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based
//		on operator provide the result to user.
		
Scanner input=new Scanner(System.in);
int result = 0;
System.out.println("Please enter first number");
int num1=input.nextInt();
System.out.println("Please enter an operator");
String operator=input.next();
System.out.println("Please enter second number");
int num2=input.nextInt();
switch(operator) {
case "+":
	result = num1+num2;
	break;
case "-":
	result=num1-num2;
	break;
case "*":
	result=num1*num2;
	break;
case "/":
	result=num1/num2;
	break;
	default:
		System.out.println("You have entered wrong operator");
	
}//if result was not calculated I do not want to see below message
if(result!=0) {
	System.out.println("The result is "+result);
}

	}
	
}
