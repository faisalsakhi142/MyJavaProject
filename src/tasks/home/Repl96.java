package tasks.home;

import java.util.Scanner;

public class Repl96 {
	  public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String s = inp.nextLine();
		    //write your code below
//		    String s;
//
//		    Write a for loop that will print out the reverse of the string.
//
//		    Sample input/outputs:
//		    In: manhattan
//		    nattahnam
//
//		    In: processor
//		    rossecorp
//
//		    In: racecar
//		    racecar
		    String reverse="";
		    int a=s.length();
		    		for(int i=a-1; i>=0; i--) {
		    			reverse=reverse+s.charAt(i);
		 
		 
		    		}
		   			System.out.println(reverse);
		    	
		    }
		    
		  }
		

