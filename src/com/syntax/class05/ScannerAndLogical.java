package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {
		/*you are a salesman
		 * ask a user for how much his sales are
		 * based on the amount of sales we need to calculate his commission
		 * if sales is between 1-100---> commission should be 10%
		 * if sales is between 200 and 500---> commission should be 30%
		 * if sales is more than 500---> commission should be 50%
		 * 
		 */
        //if your sales are 200--40
		//1- declare all variables that i will need
		Scanner scan;
		double sales;
        double commission;
        scan=new Scanner(System.in);
        System.out.println("Please enter your sales amount");
        sales=scan.nextDouble();
        
        if(sales>=1 && sales<=100) {
        	//give user 10% commission
        	commission=sales*0.10;
        }else if(sales>100 && sales<=200) {
        	commission=sales*0.2;
        }else if(sales>200 && sales <=500) {
        	commission=sales*0.3;
        }else {
        	commission=sales*0.5;
        }
        System.out.println("Based on your sales your commission is = " +commission);
	
         if(commission>100) {
        	 System.out.println("You are awesome seller");
         }
	}

}
