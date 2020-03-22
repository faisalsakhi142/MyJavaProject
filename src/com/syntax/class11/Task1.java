package com.syntax.class11;

public class Task1 {

	public static void main(String[] args) {
		//Create an array of cars : american, german, korean, italian
//		. Then retrieve all values from that array using 2 different loops
		String[] cars = { "american", "german", "korean", "italian" };

		for (int r = 0; r < cars.length; r++) {
			System.out.print(cars[r] + " ");
		}
		System.out.println();

		for (String car : cars) {
			System.out.print(car + " ");
		}
	}
}
