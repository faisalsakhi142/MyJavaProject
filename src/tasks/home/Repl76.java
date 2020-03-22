package tasks.home;

import java.util.Scanner;

public class Repl76 {
//	For you to do:
//		Write a program that creates a String array with size 7. 
//		Ask the user to input Days of a week beginning with Sunday using Scanner class.
//		Add these inputs to your array and then print all values from that array
//
//		Example:
//		Please enter day 1 of the week
//		Sunday
//		Please enter day 2 of the week
//		Monday
//		Please enter day 3 of the week
//		Tuesday etc
	public static void main(String[] args) {
		String[] week = new String[7];
		Scanner input = new Scanner(System.in);
		for (int w = 0; w < week.length; w++) {
			System.out.println("Please enter day " + (w+1) + " of the week");
			week[w] = input.nextLine();
		}
		for(int i=0; i<=week.length-1; i++) {
			System.out.println(week[i]);
		}
	}
}
