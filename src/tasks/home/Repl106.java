package tasks.home;

public class Repl106 {
//	For you to do:
//
//		1. Create a method name as newLine that should have print statement inside the method body as "newLine method implementation"
//		1. Create a method name as displayLine that should have print statement inside the method body as "displayLine method implementation"
//		3. Call both methods
//
//		Expected Output:
//		newLine method implementation
//		displayLine method implementation
	void newLine() {
		System.out.println("newLine method implementation");
	}
	void displayLine() {
		System.out.println("displayLine method implementation");
	}
	public static void main(String[] args) {
		Repl106 newLine=new Repl106();
		newLine.newLine();
		
		Repl106 displayLine=new Repl106();
		displayLine.displayLine();
	}
}
