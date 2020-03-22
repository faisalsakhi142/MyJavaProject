package tasks.home;

public class Repl91 {

	public static void main(String[] args) {
//		For you to do:
//
//			Create a String given="I love Java classes at Syntax"
//			Retrieve 2 Strings from given String and print them 
//
//			Expected Output:
//			classes at Syntax
//			I love Java
		String name="I love Java classes at Syntax";
		CharSequence partialString1 = name.subSequence(12, 29);
		System.out.println(partialString1);
		CharSequence partialString = name.subSequence(0, 11);
	System.out.println(partialString);
	}

}
