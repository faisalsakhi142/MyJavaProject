package Practice;

public class String_Class_And_Operators {

	public static void main(String[] args) {
		//String represent group of characters enclosed within double quotes.
		//for Example:
		String name="Faisal";
		System.out.println(name);//for printing the String we write the given name of String.
	System.out.println("-------------------------");	
	
	     //           String Concatenation:
	System.out.println("String Concatenation Example:");
		//Java string concatenation operator (+) is used to add/join/combine Strings to any value
       //For Example:
		String firstName="Faisal";//we can't use name here because we already wrote if in line 8
		String lastName="Sakhi";
		System.out.println("My First Name is "+firstName);
		System.out.println("My Last Name is "+lastName);
	
		System.out.println("-------------------------");
	System.out.println("---Operators in Java---");
	//Assignment Operator:
	//One of the most common operators that you'll
	//encounter is the simple assignment operator "=".
	//For Example:
	int number=10;
	String myName="Faisal";
	System.out.println(number);
	System.out.println(myName);
	
	/*Arithmetic Operators
     Operator Description
     + For Addition
     - For Subtraction
     * For Multiplication
     / For Division
     % MOD - For Remainder
	*/
	System.out.println("-------------------------");
	System.out.println("Addition Example");
	int num1=5;
	int num2=5;
	System.out.println(num1+num2);
	System.out.println("-------------------------");
	System.out.println("Subtraction Example");
	int num3=10;
	int num4=3;
	System.out.println(num3-num4);
	System.out.println("-------------------------");
	System.out.println("Multiplication Example");
	int num5=20;
	int num6=2;
	System.out.println(num5*num6);
	System.out.println("-------------------------");
	System.out.println("Division Example");
	int num7=30;
	int num8=10;
	System.out.println(num7/num8);
	System.out.println("-------------------------");
	System.out.println("MOD Example");
	int num9=30;
	int num10=9;
	System.out.println(num9%num10);
	/*Java Operators:
	Assignment =
	Arithmetic +, -, *, /, %
	Relational and Equality >, >=, <, <=, ==, !=
	Logical &&(and), || (or)
	*/
	
	
	
	
	}
}
