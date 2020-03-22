package com.syntax.class07;

public class WhileVSDoWhile {

	public static void main(String[] args) {
		int num=1;
		while (num<=5) {
			System.out.println("Hello");
			num++;
		}
System.out.println("--------USING DO WHILE LOOP--------");
//the difference between while and while do is that, while checks condition first and then executes block of code
int num1=11;
do {
	System.out.println("Hello");
	num1++;
}while (num1<=5);
	}

}
