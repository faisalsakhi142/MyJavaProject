package tasks.home;

public class Repl128 {

//	Returns:
//		an integer
//		Name:
//		countVowels
//		Parameters:
//		a String called s
//		Purpose:
//		count the number of vowels in the string s.  Assume s is all lowercase.
//
//		Examples:
//		countVowels("obama") ==> 3
//		countVowels("happy friday! i love weekends") ==> 9
	static int  countVowels(String s)
	{
		String count = s.replaceAll("[^aA,eE,iI,oO,uU]", "");
		return count.length();
	}
	
	
	
	//test case below (dont change):
public static void main(String[] args){
		System.out.println(countVowels("obama")); //3
		System.out.println(countVowels("happy friday! i love weekends")); //9
	}
}