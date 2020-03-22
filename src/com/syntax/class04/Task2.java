package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {
		//mortgage rate>4.5 (should not buy a house) 
		//otherwise user will consider buying.
		//mortgage price>200000 (user should take a loan,
		//otherwise user will pay cash
		
		double mortgageRate =  4.5;
		int mortgagePrice=200000;
		
		if(mortgageRate>4.5) {
			System.out.println("should not buy a House");
		}else {
			System.out.println("You Can buy a House");
		}if(mortgagePrice>200000) {
			System.out.println("You should take a Loan");
		}else {
			System.out.println("You will pay cash");
		}
	}

}
