package com.syntax.class23;

public class Computer {
//	Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 
//
//	Define common behavior within and some fields in parent class and override some of the methods in child classes
//	Define some methods specific to child classes
//	Create objects of child classes and store them into array. Loop through each object and execute available methods.

	public void screen() {
	System.out.println("Computer has screen");
}

public void power() {
	System.out.println("Starts by push");
}
}

class Apple extends Computer{
	
	public void screen(){
		System.out.println("Apple has screen");
	}
	public void power() {
		System.out.println("Starts by remote");	
	
}
}
class Lenovo extends Computer{
	public void screen(){
		System.out.println("Lenovo has screen");
	
}
	public void power() {
System.out.println("Starts by button");
	}
}
class HP extends Computer{
	public void screen(){
		System.out.println("HP has screen");
	
}
	public void power() {
		System.out.println("Starts by touch");
	}
}
class Dell extends Computer{
	public void screen(){
		System.out.println("Dell has screen");
}
	public void power() {
	}
}
	