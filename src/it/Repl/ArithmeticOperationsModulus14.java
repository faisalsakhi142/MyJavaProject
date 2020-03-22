package it.Repl;

public class ArithmeticOperationsModulus14 {
//	For you to do
//		Add the values of num1 and num2 and then subtract num3 from the result and store it in result1 variable
//		Multiply num4 and num5 together and then divide num6 from the result and store it in result2 variable
//		Print the following statement:
//		_______ modded by _______ is ______
//		result2           result1    blank3
//		where blank3 is the remainder of result1 into result2
	public static void main(String[] args) {
	    int num1 = 5;
	    int num2 = 4;
	    int num3 = 3;
	    
	    int num4 = 7; 
	    int num5 = 10;
	    int num6 = 5;
	    
	    //start coding here
	    int result1=6;
	    int result2=14 ;
	    int sum=num1+num2;
	    sum=9;//
	    int sub=sum-num3;
	  // System.out.println(sub);
	    
	    int mul=num4*num5;
	    //70
	    int div=mul/num6;
	  // System.out.println(div);
	    //0 
	    //remainder
	    int mod=result2%result1;
	    //.out.println(mod);//0 
	    int blank3=2;
	    //System.out.println(blank3);
	    System.out.println(result2+" modded by "+result1+" is "+blank3);
	    
	    // int result1 = (num1+num2)-num3;
	    // int result2 = num4*num5/num6;
	    // int blank3 = result2%result1;
	    // System.out.println(result2+" modded by "+result1+" is "+blank3);
	    // System.out.println(a);
	    // System.out.println(b);
	    
	  }
	}
