package com.syntax.class14;

public class Phone {
//	Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with specific
//	  attributes and behaviors.
	
	String name;
	String model;
	String color;

public static void main (String[] args) {
 
Phone phone1=new Phone();	
phone1.name="iPhone";
phone1.model="11 Pro";
phone1.color="Gold";
System.out.println("Description of "+phone1.name+phone1.model+" that has "+phone1.color+" color");
phone1.Size();
phone1.Price();
phone1.Look();


Phone phone2=new Phone();
phone2.name="Samsung";
phone2.model="S20";
phone2.color="Black";
System.out.println();
System.out.println("Description of "+phone2.name+phone2.model+" that has "+phone2.color+" color");
phone2.Size();
phone2.Price();
phone2.Look();
	
Phone phone3=new Phone();
phone3.name="Nokia";
phone3.model="11";
phone3.color="White";	
System.out.println();
System.out.println("Description of "+phone3.name+phone3.model+" that has "+phone3.color+" color");
phone3.Size();
phone3.Price();
phone3.Look();	

}
void Size() {
	System.out.println(name+" is big");
}
void Price() {
	System.out.println(name+" is expensive");
}
void Look() {
	System.out.println(name+" is beautiful");
}
}
