package tasks.home;

public class Repl113 {
//	an integer
//	Name:
//	sumEvenToX
//	Parameters:
//	an integer called "x"
//	Purpose:
//	calculate the sum of the EVEN integers from 1 to x (including x)
//
//	Examples:
//	sumEvenToX(5) ==> 6
//	sumEvenToX(8) ==> 20

	
		void  sumEvenTox(int x){
		  int sum=0;
		  for (int i=0; i<=x; i++){
		    if (i%2==0){
		      sum=sum+i;
		    }
		  }
		  System.out.println(sum);
		}
		public static void main(String []args){
		 Main obj= new Main();
		 obj.sumEvenTox(5);
		  obj.sumEvenTox(8);
		}
		}