package com.syntax.class07;

public class HomeWork4 {
public static void main (String[] args) {
//	Print odd numbers between 20 and 50 (2 ways)
	int num=20;
	while(num<=50) {
		System.out.println(num);
		num+=2;
	}System.out.println("Second way");
	int num1=20;
	while(num1<=50) {
		if(num1%2 !=0) {
			System.out.println(num1);
		}num1+=2;
	}
	
}
}
