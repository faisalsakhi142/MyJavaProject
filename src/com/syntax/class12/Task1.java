package com.syntax.class12;

public class Task1 {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday--> yadnuS).
		String str="Sunday";
		String reverse="";
		for(int i=str.length()-1;i>=0; i--) {
			reverse =reverse + str.charAt(i);
			
		}System.out.println(str);
		System.out.println(reverse);

	}

}
