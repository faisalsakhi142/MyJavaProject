package com.syntax.class03;

public class PrimitiveCasting {
public static void main (String[] args) {
	
	double d=10;
	System.out.println(d);//10.0
	
	//int i=10.99;--> compile time error saying: type mismatch, cannot convert double to int
	//Casting is changing (conversion) of 1 type into another type
	//Primitives and non primitives casting
	//2 types of casting: 
	//1:widening (impilict casting, automatically) 
	
	//byte-> short->int->long->float->double
	//2:narrowing (explicit casting, manually)
	//double->float->long->int->short->byte
	
	//narrowing, explicitly implementing
	int i=(int)10.99;
	System.out.println(i);
	
	//byte -128 to 127
	
	byte b=(byte)1284;
	System.out.println(b);
	//if you do it you must lose some information which 1284 comes to 4
	
	
}
}
