package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
//create an arraylist of cars and retrieve all the values using 3
	//different ways
	
//Create an arrayList of words. Remove every word that ends with
//"e" use iterator.

	public static void main(String[] args) {
		ArrayList<String> cars=new ArrayList<>();
		cars.add("BMW");
		cars.add("Toyota");
		cars.add("Benz");
		for(String print:cars) {
			System.out.println(print);
		}
		System.out.println("---------------");
  for(int i=0; i<cars.size();  i++) {
	 System.out.println(cars.get(i)); 
  }
  System.out.println("--------");
  Iterator <String> it=cars.iterator();
		while(it.hasNext()) {
			String print=it.next();
			System.out.println(print);
		}
	}

	
	
	
}
