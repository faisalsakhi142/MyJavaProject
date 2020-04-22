package com.syntax.class16;

public class LocalVariables {
void nameInside() {
	String name="John";// local variable that visible only within method it was declared
}
public static void main(String[] args) {
	//System.out.println(name);name won't be visible to another method since it's scope only within nameInside method
	
	
	
	boolean flag=true;
	if(flag) {
		String answer="Yes";
	}
	
	//System.out.println(answer);CE: scope of variable answer is not visible outside of 
	
	for (int i=1; i<=5; i++) {
		System.out.println();
	}
}
}
