package com.syntax.class06;

import java.util.Scanner;

public class HomeWork {
//switch(country.tolowerCase(())
	public static void main(String[] args) {
		//Ask user to enter their country and capture it. Once values are captured print which language user speaks.
Scanner input;
String country;
String language;
	input=new Scanner(System.in);
	System.out.println("Please enter your country name:");
	country=input.nextLine();
	switch (country) {
	case "Afghanistan":
		language="Dari";
		break;
	case "United States":
		language="English";
		break;
	case "Pakistan":
		language="Pashto";
	case "Iran":
		language="Persian";
		break;
		default:
			language="Alien";
	}
	System.out.println("You speak "+language);
	
	
	}
	

}
