package tasks.home;

import java.util.Scanner;

public class Repl78 {

	public static void main(String[] args) {
//		Create an int array of integers with a size of 5 and input values with Scanner. 
//		Don't print prompt questions for a user.
//		Using loop print out each element of the array that should look like the output below
//
//		Example:
//		Input:
//		1
//		2
//		3
//		4
//		5
		int[] array=new int[5];
		Scanner input=new Scanner (System.in);
		for(int i=0; i<=array.length; i++) {
			array[i+0]=input.nextInt();
		System.out.println(i);
		}
		
	
	}
}
