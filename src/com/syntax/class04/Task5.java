package com.syntax.class04;

import java.util.Scanner;

public class Task5 {
	// Create a Java program that will ask if user has a credit card or not.
	// If you user does not have a credit card then offer them.
	// If they do have one ask what is balance on the card?
	// If balance of the card is larger than 1000, tell them to pay off immediately,
	// otherwise you can tell them that they can spend more.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you have credit card?");
		boolean creditCard = input.nextBoolean();
		// boolean creditCard = false;
		if (creditCard) {
			System.out.println("what is balance on the card?");
			int balance = input.nextInt();
			if (balance > 1000) {
				System.out.println("pay off immediately");
			} else {
				System.out.println("you can spend more");

			}
		} else {
			System.out.println("You need a credit card");
		}
	}
}