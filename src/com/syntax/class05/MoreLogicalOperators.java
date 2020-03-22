package com.syntax.class05;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		//WE USE LOGICAL OPERATORS TO TEST 2 OR MORE CONDITIONS
//	we have totoal 7 days in a week
//	if day is 2,3-->SDLC Class
//	if day 6,7--> Java Class
//	if day 1,5--> Off day
//	if day 4--> review class
 int day=6;
 //To Compare 2 numbers we use equality operator (==)
 if(day==2 && day==3) {
	 System.out.println("Today is SDLC Class");
 }else if(day==6 && day==7) {
	 System.out.println("Today is JAVA Class");
 }else if (day==1 && day==5) {
	 System.out.println("Today is no Class, it is day off");
 }else if(day==4) {
	 System.out.println("Today is a review class with Elion");
 }else {
	 System.out.println("Invalid day");
 }
 
 
 System.out.println("-------------Using Strings-------------");
//To Compare String we use equals
 String day1="Saturday";
 if(day1.contentEquals("Tuesday") || day1.contentEquals("Wednesday")) {
	 System.out.println("Today is SDLC Class");
 }else if(day1.contentEquals("Saturday") || day1.contentEquals("Sunday")) {
System.out.println("Today is JAVA Class");
 }else if(day1.contentEquals("Monday") || day1.contentEquals("Friday")) {
	 System.out.println("Today is no Class, it is day off");
	}
}
}