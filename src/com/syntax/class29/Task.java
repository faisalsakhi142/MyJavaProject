package com.syntax.class29;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task {

	public static void main(String[] args) {
//		 Create a Set collection in which you need to add names of the countries. In this set we want all objects to be sorted in alphabetical order.
		//Using 2 different ways retrieve all elements from set.

	  Set<String>Countries=new TreeSet<>();
	  Countries.add("India");
	  Countries.add("USA");
	  Countries.add("Afghanistan");
	  Countries.add("Tajikistan");
	  		System.out.println(Countries);
	  		
	  		for(String countries:Countries) {
	  			System.out.println(countries+" ");
	  		}
	  		System.out.println("----------");
	  		Iterator<String> It=Countries.iterator();
	  		while(It.hasNext()) {
	  			System.out.println(It.next());
	  		}
		
	}

}
