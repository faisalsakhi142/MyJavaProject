package com.syntax.class03;

import java.util.Scanner;

public class NewScanner {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		   System.out.println("Is it sunny outside?");
		   boolean isSunny=input.nextBoolean();
		   System.out.println("What is the temperature otside?");
		   int temperature=input.nextInt();

		   if(temperature>85) {
			   System.out.println("It is a sunny day, I should go somewhere!");
		        }else if(temperature==85) {
				   System.out.println("I am going to the beach");

			    }else if(temperature<85) {

				   System.out.println("I am going to the park");  		

		   }else {
			   System.out.println("I stay home and practice Java");
		   }
		   }
	}