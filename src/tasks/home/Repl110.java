package tasks.home;

public class Repl110 {
//	For you to do :
//
//		Step1: Create three methods that will accept 2 in parameters on integer type
//		Step2: Write the logic in methods to perform actions below:
//
//		The first method for multiplication
//		The second method for addition 
//		The third method for subtraction
//
//		Step3: execute all methods
//
//		1. for the addition method add two numbers to make 30 
//		2. for multiplication multiply two numbers to make 30 
//		3. for Subtraction subtract two numbers to equal 20
//
//		Expected Output:
//		Addition 30
//		Multiplication 30
//		Subtraction 20
	void add(int a, int b) {
		System.out.println("Addition "+(a+b));
		
	}
	void mul(int a, int b) {
		System.out.println("Multiplication "+(a*b));
	}
	void sub(int a, int b) {
		System.out.println("Subtraction "+(a-b));
	}
	public static void main(String[] args) {
		Repl110 add=new Repl110();
		add.add(10, 20);
		
		Repl110 mul=new Repl110();
		mul.mul(10, 3);
		
		Repl110 sub=new Repl110();
		sub.sub(30, 10);
	}
}
