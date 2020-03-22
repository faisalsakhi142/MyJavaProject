package tasks.home;

import java.util.Scanner;

public class Repl77 {
//	For you to do:
//		Create an array of integers that will store 5 elements taken from a user
//		Don't print any prompt message for the user
//		Then print out all the elements you have created in the first loop in reverse order. 
	 public static void main (String[]args){
		 Scanner scan=new Scanner(System.in);
		 int[] arr=new int[5];   
		
		    
		   for(int i=0; i<=arr.length; i++) {
			    arr[i]= scan.nextInt();   
			    //System.out.println(num);
		   }
		   
		    for(int i=arr.length-1;i>=0; i--) {
		    	System.out.println(arr[i]);
		    	
		    	//for (int i = animals.length - 1; i >= 0; i--) {
		    	
		    }
		    
		  }
	}

