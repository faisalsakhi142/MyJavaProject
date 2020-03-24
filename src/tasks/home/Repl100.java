package tasks.home;

import java.util.Scanner;

public class Repl100 {

	 public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String s = inp.nextLine();
		    //write your code below
		//    System.out.println(s+" ");
		 for(int i=0; i<s.length(); i++) {
			 char s1=s.charAt(i);
			 System.out.print(s1+" ");
		 }
		  }
		}