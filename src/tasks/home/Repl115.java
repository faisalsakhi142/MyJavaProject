package tasks.home;

public class Repl115 {
//	a String
//	Name:
//	censorLetter
//	Parameters:
//	a String
//	a char
//
//	Then complete the method by programming the following behavior
//	Replace all instances of given character with a "*" within the given String.
//	See below examples.
//
//	Examples:
//	censorLetter("computer science",'e') ==> "comput*r sci*nc*"
//	censorLetter("trick or treat",'t') ==> "*rick or *rea*"
	   String censorLetter(String str, char c) {

				str=str.replace(c, '*');
				return str;
			}

			public static void main(String[] args){

				Repl115 obj=new Repl115();
				System.out.println(obj.censorLetter("computer science",'e')); //“comput*r sci*nc*”
				System.out.println(obj.censorLetter("trick or treat",'t')); //“*rick or *rea*”
			}
	}