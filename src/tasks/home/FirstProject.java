package tasks.home;

import java.util.Scanner;

public class FirstProject {

	
	public static void main (String[] args) {
		
		
		Scanner input;
		input=new Scanner (System.in);
		System.out.println("Syntax Technologies");
		System.out.println("Enroll Today?");
		String name=input.nextLine();
	if(name.equals("Yes")) {
		System.out.println("Let's get started");
		System.out.println("Please tell us your name");
		String firstname=input.nextLine();
		System.out.println("Welcome "+firstname);
		System.out.println("We have 2 offers. 1-Online 2-In Class. Which one will you prefere?");
		String prefere=input.nextLine();
	    if(prefere.equals("In Class")) {
		System.out.println("We will meet soon!");	
		}else {
			System.out.println("Glad to have you with us");
		}System.out.println("Let's start enrolling");
		System.out.println("Please write your Email");
		String Email=input.nextLine();
		System.out.println("Please enter your Phone Number");
		String phoneNumber=input.nextLine();
		System.out.println("Money Time");
		System.out.println("Our fee for Online students is montly $350 and for our class students is montly $450");
		System.out.println("If your online so write 1 if not write 2");
		int write=input.nextInt();
		if(write==1) {
			System.out.println("We will send you the Contract in your givin Email");
			System.out.println("Thanks for being one of our student");
			
		}else if(write==2) {
			System.out.println("We will send you the Contract in your givin Email");
			System.out.println("Thanks for being one of our students");
		}
		
	}else {
		System.out.println("See you soon!");
	}
		
	}
}