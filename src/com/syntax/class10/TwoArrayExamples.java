package com.syntax.class10;

public class TwoArrayExamples {

	public static void main(String[] args) {
		String[][] month= {{"January","February","December"},
				{"March","April","May"}};
		System.out.println("I was born in "+month[1][2]);
    int rows=month.length;//how many arrays
    System.out.println(rows);
    int firstArray=month[1].length;
    System.out.println(firstArray);
    System.out.println("-----------");
    for(int i=0; i<month.length; i++) {
    	for(int j=0; j<month[i].length; j++) {
    		System.out.println(month[i][j]);
    	}
    }
	}

}
