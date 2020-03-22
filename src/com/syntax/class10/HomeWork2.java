package com.syntax.class10;

public class HomeWork2 {

	public static void main(String[] args) {
		//Create a 2D array that first row will contain 4 names and second row will contain grades.
		//Then you program should print name of the students that has A and B grade
String[][] NAndG= {{"Rohani","Faisal","Salih","Ahmet"},
		                    {"A","B","C","D"}};
System.out.println(NAndG[0][0]+" has "+NAndG[1][0]+" grade");
System.out.println(NAndG[0][1]+" has "+NAndG[1][1]+" grade");
	}

}
