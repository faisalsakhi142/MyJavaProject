package com.syntax.class17;

//import com.syntax.class10.ClassTask;

public class HomeWork {
//	Create a method that will accept an array as parameters and will return a sum of all elements from that array.
//			Method should be visibly only within same package and accessible by the creating an instance of the class

	protected int method1(int [] array) {
		
		int sum=0;
		for(int i=0; i<array.length; i++) {
			sum+=array[i];
		}
		return sum;
	 
 }
	public static void main(String[] args) {
		int[] array= {12,4,2,2};
		HomeWork obj=new HomeWork();
		int sum1 = obj.method1(array);
		System.out.println(sum1);
		
	}
}


