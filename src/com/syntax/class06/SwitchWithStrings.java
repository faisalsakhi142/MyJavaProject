package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrings {

	public static void main(String[] args) {
		/* ask a user where he or she is from 
		 * based on the country we will define favorite food
		 * your favorite food is _____
		 */
Scanner input;
String country;
String favoriteFood;
input=new Scanner(System.in);
System.out.println("Please enter your country");
country=input.nextLine();
switch(country) {
case "Morocco":
	favoriteFood="Potato";
	break;
case "Tajikistan":
	favoriteFood="Osh";
case "Afghanistan":
	favoriteFood="Mantu";
	break;
	default:
		favoriteFood="Unknown";
}
	
	System.out.println("Your favorite food is "+favoriteFood);
	}
}
