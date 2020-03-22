package com.syntax.class07;

public class HomeWork {

	public static void main (String[] args) {
		
		//Print numbers from 1 to 100 in 1 line with space
		//first way(with while)
		int num=1;
		while (num<=100) {
			System.out.print(num+" ");
			num++;
		}
		
		
		
		//second way(with do...while
		System.out.println("");
		int num1=1;
		do {
			System.out.print(num1+" ");
			num1++;
		}while(num1<=100);
		
		
		
		
         //third way(with for)		
			System.out.println(" ");
		for (int num2 =1; num2 <= 100; num2++) {
			System.out.print(num2+" ");
		}
	}

	}

	

