package tasks.home;

public class Repl134 {
//	For you to do:
//
//		Create the maxLength method that will accept String array of words and return the word with the largest length.
//
//		Method should visible only within same package!
//
//		Expected Output:
//		this is long
public static void main (String[] args) {	
	String[] arr = { "hey", "yolo", "hi", "this is long"};
	System.out.println(maxLength(arr));
	// should print "this is long"
}
static String maxLength(String [] words) {
	int a=0;
	int Length=words[0].length();
	for(int i=1; i<words.length; i++) {
		if(words[i].length()<Length) {
			a=i;
		Length=words[i].length();
		}
	}
	return words[a];
}

}
