package tasks.home;

import java.util.Scanner;

public class Repl99 {

	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
for(int i=0; i<word.length(); i++) {
	 char word1 = word.charAt(i);
	 System.out.println(word1);
}
	    
	}
}
