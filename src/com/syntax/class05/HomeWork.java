package com.syntax.class05;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
//		Write a program that will read three inputs of scores (quiz, mid term, and final scores) 
		//and determine the grade based on the following rules: 
//			if the average score >=90 → grade=A
//			if the average score >= 70 and <90 → grade=B
//			if the average score>=50 and <70 → grade=C
//			if the average score<50 → grade=F
//
Scanner input=new Scanner(System.in);
System.out.println("Please write the quiz score");
double qscore=input.nextDouble();
System.out.println("Please write the mid term score");
double mtscore=input.nextDouble();
System.out.println("Please write the final score");
double fscore=input.nextDouble();
if(((qscore+mtscore+fscore)/3)>=90){
	System.out.println("Your grade is A");
}else if(((qscore+mtscore+fscore)/3)>=70 && ((qscore+mtscore+fscore)/3)<90 ){
	System.out.println("Your grade is B");
	}else if(((qscore+mtscore+fscore)/3)>=50 && ((qscore+mtscore+fscore)/3)<790 ){
		System.out.println("Your grade is C");

}else if(((qscore+mtscore+fscore)/3)>=50){
	System.out.println("Your grade is F");
}
}
}