package tasks.home;

public class Repl117 {
//	For you to do:
//		declare 3 instance variables to hold an integer, double and char values.
//
//		Create 2 instances of the class and assign values to variables and the print them
//
//		Expected Output:
//		10
//		10.23
//		a
//		100
//		100.23
//		s
	
	int a;
	double b;
	char c;
	public static void main(String[] args) {
		Repl117 obj=new Repl117();
		obj.a=10;
		obj.b=10.23;
		obj.c='a';
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		Repl117 obj1=new Repl117();
		obj1.a=100;
		obj1.b=100.23;
		obj1.c='s';
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.c);
	}
}
