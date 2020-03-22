package com.syntax.class15;

public class Task2 {
void number(int evenOdd) {
	if(evenOdd%2==0) {
		System.out.println(evenOdd+ " is even number");
		
	}else {
		System.out.println(evenOdd+" is Odd number");
	}
}
public static void main(String[] args) {
	Task2 num=new Task2();
	num.number(9);
}
}
