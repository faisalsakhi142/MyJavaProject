package com.syntax.class06;

import java.util.Scanner;


public class Task {
//
//	A school has following rules for grading system:
//		a. 1 to 25 - F
//		b. 25 to 45 - E
//		c. 45 to 50 - D
//		d. 50 to 60 - C
//		e. 60 to 80 - B
//		f. Above 80 - A
//		Ask the user to enter marks and print the corresponding grade. 
//
//		Example Output:
//		Please enter your mark
//		Your grade is A
//
//		Example Output:
//		Please enter your mark
//		Please enter valid mark
public static void main(String[] args) {
	int mark;
	String grade;
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter your mark");
	//System.out.println("Please enter valid mark");
	mark=input.nextInt();
	//System.out.println("Please enter valid mark");
	
	if(mark>=1 && mark<=25) {
     grade="F";
	}else if(mark>25 && mark<45) {
		grade="E";
	}else if(mark>45 && mark<50) {
		grade="D";
	}else if(mark>50 && mark<60) {
		grade="C";
	}else if(mark>60 && mark<80) {
		grade="B";
	}else if(mark>80) {
		grade="A";
	}else {
		grade="Please enter valid mark";
	}if(mark>0) {	
		System.out.println("Your grade is "+grade);
	}else {
		System.out.println(grade);
	}
}
}






//System.out.println("Please enter your mark");
//int score;
//score=scan.nextInt();
//String grade;
//if (score>=1 && score<=25){
//  grade=("F");
//}else if (score>25 && score<=45){
//  grade=("F");
//}else if (score>45 && score<=50){
//  grade=("D");
//}else if (score>50 && score<=60){
//  grade=("E");
//}else if(score>60 && score<=80){
//  grade=("B");
//}else if(score>80){
//  grade="A";
//  }else {
//	  grade="Please enter valid mark";
//}
//if(score>0){
//System.out.println("Your grade is "+(grade));
//}else {
//System.out.println(grade);
//}