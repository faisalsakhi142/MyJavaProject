package tasks.home;

public class Repl112 {
//	Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise returned false
//			( Return false if one or both given numbers are not even)
//
//			Examples:
//			bothEven(4,6) ==> true
//			bothEven(3,4) ==> false
//			bothEven(-1,1) ==> false
//
//			Expected Output:
//			false
	
		boolean evenOdd (int a, int b) {

			boolean flag =false;

			if (a%2==0 && b%2==0) {

				flag=true;
			} else {
				flag=false;

			}
			return flag;

		}
		public static void main(String[] args) {

			Repl112 x= new Repl112 ();

	        boolean nums=x.evenOdd(5, 10);

			System.out.println(nums);
		}
	}