package com.syntax.class05;

public class LogicalNot {
//Not(!)- reverse the condition
	public static void main(String[] args) {
		boolean b=true;
		boolean val=false;
		System.out.println(!b);
		System.out.println(!val);

		
		boolean isCold=false;
		if(!isCold) {
			System.out.println("Hello");
		}else {
			System.out.println("Bye");
		}
		
		String day1="Sunday";
	
		//if it is not monday --> Find me at Syntax
		if(!(day1.contentEquals("Monday") && day1.equals("Friday"))){
			System.out.println("Find me at Syntax");
		}
	}

}
