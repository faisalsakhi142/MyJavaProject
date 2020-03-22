package com.syntax.class05;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
//		Write a program to find largest of three double values using if-else..if and logical operators provided
//		by a user (numbers must be distinct)
Scanner input=new Scanner(System.in);
double largest = 0;
System.out.println("Please enter your first Number");
double fn=input.nextDouble();
System.out.println("Please enter your second Number");
double sn=input.nextDouble();
System.out.println("Please enter your third Number");
double tn=input.nextDouble();
if(fn>sn && fn>tn) {
	largest=fn;
} else if(sn>fn && sn>tn) {
	largest=sn;
}else if(tn>fn && tn>sn) {
	largest=tn;
	
}System.out.println("Your largest number is "+largest);
	}
}
