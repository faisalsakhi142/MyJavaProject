package tasks.home;

public class Repl118 {
//	For you to do:
//
//		Declare 3 instance variables to hold:
//		name of the country
//		capital
//		population size
//
//		Create a method to display values of instance variables
//
//		Create 2 Object, assign values to instance variables, execute method display;
//
//		Expected Output:
//		The capital of USA is Washington DC and population is 330000000
//		The capital of Kazakhstan is Astana and population is 18500000
	String country;
	String capital;
	int size;
	void displayValues() {
		System.out.println("The capital of "+country+" is "+capital+ "and population is "+size);
	}
		public static void main(String[] args) {
	 Repl118 obj=new Repl118();		
		obj.country="USA";
		obj.capital="Washington DC";
		obj.size=330000000;
		obj.displayValues();
			Repl118 obj1=new Repl118();
			obj1.country="Kazakhstan";
			obj1.capital="Astana";
			obj1.size=18500000;
			obj1.displayValues();
	}
		
	}

