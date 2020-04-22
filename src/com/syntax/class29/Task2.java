package com.syntax.class29;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {
		// Create a Set of cities in which you want to make sure that insertion order is maintained. Using Iterator remove any city that starts with “A”;

		Set<String>cities=new LinkedHashSet<>();
		cities.add("Afghanistan");
		cities.add("Albania");
		cities.add("Algeria");
		cities.add("Andorra");
		cities.add("Angola");
		cities.add("USA");
		Iterator<String> It=cities.iterator();
		while(It.hasNext()) {
			String element= It.next();
			if(element.startsWith("A")) {
				It.remove();
			
			}
			
		}
		System.out.println(cities);
		
		
	}

}
