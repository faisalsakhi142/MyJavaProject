package Practice;

import java.util.ArrayList;


public class Type_Casting {

	public static void main(String[] args) {
		/* Assigning a value of one type to a variable of another type is known as Type Casting.
		 * 2 types of casting:
1. widening (implicate casting, automatically)
converting lower data type into higher.
byte-> short-> int-> long-> float->double
widening, happens implicitly
for Example:
		 */
		System.out.println("---Widening Example---");
		double num= 20.7;
		System.out.println(num);
		/* Narrowing Casting(Explicit/ Manual) - converting higher data type into lower.
		 * double->float-> long-> int-> short->byte
		 * narrowing, explicitly implementing
		 * For Example:
		 */
		System.out.println("---Narrowing Example---");
		float number=12.554f;   //without narrowing
		System.out.println(number);
		float number1=(int)12.554f;   //with narrowing. for narrowing we write the data type name in () and then print it.
        System.out.println(number1);
	}

}



 
