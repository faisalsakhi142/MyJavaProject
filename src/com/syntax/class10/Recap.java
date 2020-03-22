package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		//how many elements stored inside an array?
		String[] cities= {"Washigton DC", "New York", "Paris", "Miami", "Los Angeles", "Dallas"};
		int arraySize=cities.length;
		System.out.println("Total elements "+arraySize);
		//how can we access last element from an array?
		System.out.println(cities[arraySize-1]);
       //access all elements from an array
		//cities[0], cities[1], cities[2]
		for(int i=0; i<arraySize; i++) {
			System.out.println(cities[i]);
		}
		System.out.println("Create an array of fruits and retrieve all elements");
		String[] fruits= {"Banana","Kiwi","Apple", "Mango"};
		//advanced for loop, enhanced for loop, for each loop
		//if fruit is apple--> that is your favorite fruit
		for(String fruit:fruits) {
			if(fruit.equals("Apple")) {
				System.out.println(fruit+" is your favorite fruit");
			}else {
				System.out.println(fruit);	
			}
			
		}
	}

}
