//Create a Set collection that will hold Objects of Student Type. In this set we do not care about the insertion order.
	//	Each student object should have name and studentID. Display name of each student.

package com.syntax.class29;



import java.util.HashSet;

import java.util.Iterator;

import java.util.Set;



class Student {



	public String name;

	private int studentID;



	public Student(String name, int studentID) {

		this.name = name;

		this.studentID = studentID;

	}



	public String getName() {

		return name;

	}



}



public class Task3 {

	public static void main(String[] args) {



		Set<Student> students = new HashSet<>();



		students.add(new Student("Faisal", 101));

		students.add(new Student("Rohani", 102));

		students.add(new Student("Ahmet", 103));


		

		Iterator <Student> student = students.iterator();

		

		while(student.hasNext()) {

			System.out.print(student.next().name+" ");

		}

	}

}