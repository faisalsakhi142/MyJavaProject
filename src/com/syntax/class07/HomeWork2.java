package com.syntax.class07;

public class HomeWork2 {

	//Print numbers from 100 to 1
	public static void main (String[] args) {
//first way(with while
	int num=100;
while(num>=1) {
	System.out.println(num);
	num--;
	
	}System.out.println(" ");
	
	
	
	
	//second way(with do...while
	int num1=100;
	do {
		System.out.println(num1);
		num1--;
	}while(num1>=1);
	
	System.out.println(" ");
	
	
	
	
	//third way(with for)
	for (int num2=100; num2>=1; num2--) {
		System.out.println(num2);
		
	}
	
	
	
	}	
}