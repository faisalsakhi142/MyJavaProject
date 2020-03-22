package com.syntax.class10;

public class Task3 {

	public static void main(String[] args) {
		String [] country = {"Turkey", "Afghanistan","Pakistan","New Delhi"};
		for (String countries:country) {
			if (countries.equals("Turkey")){
				System.out.println("The Capital of "+countries+" is Ankara");
			}else if (countries.equals("Afghanistan")){
				System.out.println("Kabul");
			}else if (countries.contentEquals("Pakistan")){
				System.out.println("Islamabad");
			}else if (countries.contentEquals("India")){
				System.out.println("New Delhi");
			}

		}
		System.out.println("---second way---");
		for(int y=0; y<country.length; y++) {
			switch(country[y]) {
			case "Turkey":
				System.out.println("The Capital is Ankara");
				break;
		}
		}
		}
}