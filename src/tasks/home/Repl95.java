package tasks.home;

public class Repl95 {

	public static void main(String[] args) {
//		For you to do:
//
//			Create a String given="Hello Syntax friends". 
//			Using String methods from given String create new String "Welcome Syntax family"
//
//			Expected Output:
//			Welcome Syntax family


	String given="Hello Syntax friends";
	
	given=given.replace("Hello", "Welcome").replace("friends", "family");
	
	System.out.println(given);

	}

}
