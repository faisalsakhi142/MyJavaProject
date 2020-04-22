package tasks.home;

public class Repl121 {
//	For you to do:
//
//		Declare a static variable number that will hold an integer value:
//
//		Access number from the main method and assign value to it.
//		Create an Object of the class, access number in a nonstatic way and assing value of 200.
//
//		Print out number using class name and using instance
//
//		Expected Output:
//		200
//		200
	
	static int number=200;
	
		public static void main(String[] args) {
			System.out.println(number);
		Repl121	obj=new Repl121();
		obj.number=200;
		System.out.println(obj.number);
		}
	
}
