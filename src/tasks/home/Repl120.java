package tasks.home;

public class Repl120 {
//	Declare static variable in class level as below and assign its value:
//
//		String ss="Welcome To Syntax Technologies"
//
//		Access variable in the main method and print it using three ways you learned so far
//
//		Hint:
//		first way: By calling directly
//		Second way: By using the className
//		Third way: By creating the object of the class
//
//		Expected Output:
//		Welcome To Syntax Technologies
//		Welcome To Syntax Technologies
//		Welcome To Syntax Technologies
	
   static String name="Welcome to Syntax Technologies";

	  
   public static void main(String[] args) {
	   System.out.println(name);
	   Repl120 obj=new Repl120();
	   obj.name="Welcome To Syntax Technologies";
	   System.out.println(obj.name);
System.out.println(Repl120.name);
   }
	
}
