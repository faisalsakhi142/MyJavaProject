package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		boolean classToday=true;
		boolean quiz=false;
		if (classToday) {
			System.out.println("Welcome");
			
		if (quiz) {
		System.out.println("Today is Quiz");
		
		} else {
			System.out.println("Today is no class");
		}
		
		}else {
			System.out.println("It's Holiday");
		}
	 System.out.println("I am outside of if condition");

	}	

}
