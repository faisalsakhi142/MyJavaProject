package tasks.home;

public class Repl116 {
//	For you to do:
//
//		Declare 3 instance variables to hold: 
//
//		year, school name and batch #
//
//		Access variables from the main method and assign specific values to them
//		Print values of your variables in the following format:
//
//		Expected Output:
//		I am a student of batch 6 studying at Syntax in the year of 2020
	
	int year;
	String schoolName;
	int batch;
	
	public static void main(String[] args) {
	Repl116	obj=new Repl116();
	obj.year=2020;
	obj.schoolName="Syntax";
	obj.batch=6;
	System.out.println("I am a student of batch "+obj.batch+" studying at "+obj.schoolName+" in the year of "+obj.year);
	}
	
}
