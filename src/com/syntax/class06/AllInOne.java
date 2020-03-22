package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
String sale;
double price = 0;
double discount;
double finalprice;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Is there a sale?");
sale=input.nextLine();
if(sale.equals("Yes")) {
	System.out.println("What is the Price of the Item?");
	price=input.nextDouble();
	if(price<20) {
		discount=(price*0.1);
		finalprice=price-discount;
		System.out.println("After 10% discount the price of the item reduced from "+price+" to "+discount);
	}else if(price>=20 && price<=100) {
		discount=(price*0.2);
		finalprice=price-discount;
		System.out.println("After 20% discount the price of the item reduced from "+price+" to "+discount);
	}else if(price>=100 && price<=500) {
		discount=(price*0.3);
		finalprice=price-discount;
		System.out.println("After 30% discount the price of the item reduced from "+price+" to "+discount);
	}else if(price>500) {
		discount=(price*0.5);
		finalprice=price-discount;
		
System.out.println("After "+discount+" the price of the item reduced from "+price+" to "+finalprice);
}
}else {
	System.out.println("We are not going shopping");	
	}
}
}