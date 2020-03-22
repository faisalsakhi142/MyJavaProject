package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		String[] animals= {"dog", "cat", "mouse", "lion", "tiger", "cow"};
		int arraySize=animals.length;
		for(int i=0; i<arraySize; i++) {
			System.out.println(animals[i]);
	}
		System.out.println("---Second Way---");
		for(String animal:animals) {
			System.out.println(animal);
		}
	}
}
