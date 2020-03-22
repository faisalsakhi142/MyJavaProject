package com.syntax.class07;

public class HomeWork3 {

	public static void main(String[] args) {
		//Print even numbers from 20 to 1 (2 ways)
//first way(while)
//		int num=20;
//		while(num>=1) {
//			System.out.println(num);
//			num-=2;
//		}System.out.println(" ");
//		//second way
		int number=20;
		while(number>=1) {
			if (number% 2 !=0) {
			System.out.println(number);
			}number-=2;
		}
		
		
		
		
		//second way(do...while)
//		
//		int num1=20;
//		do {
//			System.out.println(num1);
//			num1-=2;
//		}while(num1>=1);
//		System.out.println(" ");
//		
//		
		
		
//		//third way(for)
//		for(int num2=20; num2>=1; num2-=2) {
//			System.out.println(num2);
//		}
	}
	

}
