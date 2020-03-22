package com.syntax.class09;

public class HomeWork {

	public static void main(String[] args) {
//		Create an array of chars and store grades into
//		it: A,B,C,D,E,F. Then print a grade B (use 2
//		different ways of creating an array).
	System.out.println("---First Way---");
		char[] gradeArray=new char[6];
	gradeArray[0]='A';
	gradeArray[1]='B';
	gradeArray[2]='C';
	gradeArray[3]='D';
	gradeArray[4]='E';
	gradeArray[5]='F';
	System.out.println("Grade "+gradeArray[1]);
	System.out.println("---Second Way---");
	char[] gradesArray= {'A','B','C','D','E','F'};
	System.out.println("Grade "+gradesArray[1]);
	//getting all elements
	for(int i=0; i<gradeArray.length; i++) {
		System.out.println(gradesArray[i]);
		System.out.println("---printing using advanced for loop---");
		for(char grade:gradeArray) {
			System.out.println(grade);
		}
	}
	
	
	}
}