package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		int time=10;
		if(time>12) {
			System.out.println("Good morning");
		}
System.out.println("--------WHILE LOOP-------");
while (time<12) {
	System.out.println("Good morning");//code will execute
	time++;
	//Good morning will get print until the condition is true!
}
		//how to print numbers from 1 to 50?
int num=1;
while(num<=50) {
	System.out.println(num);
	num++;
}
		//how to print numbers from 20 to 30?
int num1=20;
while(num1<=30) {
	System.out.println(num1);
	num1++;
}
		System.out.println("********************");
		//how to print number from 5 to 15 all in 1 line
		int num2=5;
		while(num2<=15) {
			System.out.println(num2+" ");
			num2++;
		}
		System.out.println("*****************");
		//how to print values from 10 to 1?
		int num3=10;
		while (num3>=1){
			System.out.println(num3);
			num3--;
		}
		//hot to print 50 to 1
		int num4=50;
		while (num4>=1){
			System.out.println(num4);
			num4--;
		}
		System.out.println("How to print odds numbers from 1 to 20");
		int num5=1;
		while (num5<20) {
			System.out.println(num5);
			num5+=2;
			System.out.println("second way"); //second way
			int num6=1;
			while (num6<=20) {
				if(num6%2 !=0) {
					System.out.println(num6);
				}num6++;
				
			}
			boolean rain=true;
			while(rain); {
				System.out.println("take umbrella");
				rain=false;//to stop infinite we make it false, else it will print infinite!!!
			}
			
		}
	}

}
