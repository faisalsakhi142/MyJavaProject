package com.syntax.class04;

public class Task {
	// if user have diploma-->Congratulations
	// should check a gpa score, if>=3.5 "Your eligible for scholarship
	// otherwise--> You should get a degree
	// otherwise-->"You should have studied harder"
	public static void main(String[] args) {
		boolean diploma = true;
		double gpa = 3.8;

		if (diploma) {
			System.out.println("Congratulation");
			if(gpa>=3.5) {
				System.out.println("You are eligibile for scholarship");
			}else {
				System.out.println("You should have studied harder");
			}
			
		} else {
			System.out.println("You should get a degree");
		}
	}

}
