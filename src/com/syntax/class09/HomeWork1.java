package com.syntax.class09;

public class HomeWork1 {

	public static void main(String[] args) {
//		Create an array of names and store all names
//		of your group. Then print your name from
//		that array. (use 2 different ways of creating
//		an array).
		System.out.println("---First Way---");
		String[] YouthTesters=new String[8];
		YouthTesters[0]="Ilkhomdzhon Ishonkulov";
		YouthTesters[1]="Umedzhon Kasymov";
		YouthTesters[2]="Said Rohani";
		YouthTesters[3]="MD Saifuzzaman";
		YouthTesters[4]="Faisal Sakhi";
		YouthTesters[5]="Ahmad Salih";
		YouthTesters[6]="Anshumann Sharma";
		YouthTesters[7]="Prince Tetteh";
      System.out.println(YouthTesters[4]);
      System.out.println("---Second Way---");
      String[] YouthTester= {"Ilkhomdzhon","Umedzhon","Rohani","Saifuzzaman","Faisal Sakhi","Salih", "Anshumann","Tetteh" };
      System.out.println(YouthTester[4]);
	}

}
