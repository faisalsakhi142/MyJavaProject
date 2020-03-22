package com.syntax.class09;

public class MoreArrays {

	public static void main(String[] args) {
		//arrays are fixed in size
		String[] students=new String[3];
		students[0]="Hassna";
		students[1]="Munir";
		students[2]="Salih";
		//students[3]="Ahmet";--> during run time java machine will give
		//ArrayIndexOutOfBoundsException
		//System.out.println(students[3]);
		//if we store less elements thatn we declared
		//compiler will add default values
		String[] inClassStudents=new String[4];
		inClassStudents[1]="Rohani";
		inClassStudents[2]="Tetty";
System.out.println(inClassStudents[3]);//it will give null
	}

}
