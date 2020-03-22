package com.syntax.class08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
	

		Scanner input = null;
		input=new Scanner(System.in);
		double price;
		
		System.out.println("Please pay for a candy");
		price=input.nextDouble();
		while(price!=2) {
			System.out.println("Please pay for a candy");
			price=input.nextDouble();
		}System.out.println("Enjoy the candy");
		
		
		int total=2;
		for(int k=1; k<4; k++) {
			total=total*k;
		}
		System.out.println(total);
	}

}
