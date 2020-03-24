package it.Repl;

public class Main {
//	Create a Class Main 
//
//	In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
//	Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
//
//	The output of the program should be as following:
//	 
//	Husky can bark
//	Husky can run
//	Husky can play
//	Bulldog can bark
//	Bulldog can run
//	Bulldog can play
//	Labrador can bark
//	Labrador can run
//	Labrador can play
	String breed;
	String name;
	String color;
	public static void main(String[] args) {
	Main dog1= new Main();
	dog1.name="Husky";
	dog1.bark();
	dog1.run();
	dog1.play();
	
	Main dog2= new Main();
	dog2.name="Bulldog";
	dog2.bark();
	dog2.run();
	dog2.play();
	
	Main dog3=new Main();
	dog3.name="Labrador";
	dog3.bark();
	dog3.run();
	dog3.play();
	}
	void bark() {
		System.out.println(name+" can bark");
		
	}
	void run() {
		System.out.println(name+" can run");
	}
	void play() {
		System.out.println(name+" can play");
	}
}
