package tasks.home;

public class Repl111 {
//	Create a method that will accept a String as a parameter and return new String all in upper case
//
//			Call method
//
//			Expected Output:
//			TEST
	public static String Capital(String name)
	{
		return name.toUpperCase();
	}
	public static void main(String[] args){
		System.out.println(Capital("test"));
	}
}
