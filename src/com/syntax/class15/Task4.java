package com.syntax.class15;

public class Task4 {
	char mark(int a) {
		char grade;
		if(a>90) {
			grade='A';
		}else if (a<=90 && a>80) {
			grade='B';
		}else if (a<=80 && a>70) {
			grade='C';
		}else {
			grade='F';
		}return grade;
}
	public static void main(String[] args) {
		 Task4 obj=new Task4();
		 char mark=obj.mark(65);
	 System.out.println(mark);
		 System.out.println(obj.mark(65));
		
	}
}
