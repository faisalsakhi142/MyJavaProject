package com.syntax.class05;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
//		Write a program for user to enter his/hers birth month. Based on the month define the season.
//		Example: if user is born in June, July or August → season =“Summer”.
//		At the end of the program we should see output as “You were born ______“.
Scanner input=new Scanner(System.in);
String season = null;
System.out.println("Please enter your month:");
String bm=input.nextLine();
if(bm.contentEquals("March") || bm.contentEquals("April") || bm.contentEquals("May")) {
	season="Spring";
}else if(bm.contentEquals("June") || bm.contentEquals("July") || bm.contentEquals("Augest")) {
	season=("Summer");
}else if (bm.contentEquals("September") || bm.contentEquals("October") || bm.contentEquals("November")) {
	season=("Fall");
}else if (bm.contentEquals("December") || bm.contentEquals("January") || bm.contentEquals("February")) {
	season=("Winter");
	}System.out.println("You were born in "+season);
	}
}