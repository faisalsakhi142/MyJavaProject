package Practice;

public class If_Statement {

	public static void main(String[] args) {
		/*The Java if statement is the most simple decision-making statement. It is used to decide whether a certain
		 *  statement or block of statements will be executed or not i.e if a certain condition is true then a block
		 *   of statement is executed otherwise not
		 */
      System.out.println("---Example of If Statement---");
		String name="Faisal";
        if(name=="Faisal") {
        	System.out.println("It is you");
        }
        	//if...else Statement
//        This statement provides a secondary path of execution when an “if” condition is false it executes the command in else statement.
        System.out.println("--- Example of if...else Statement");
        	int codeNumber=1234;
        if(codeNumber==1234) {
        	System.out.println("You can enter");
        }
        else {
        	System.out.println("Please right the correct code");
        }
        /*if else if: This statement used to test various conditions
         */
        System.out.println("--- Example of if else if Statement");
        String whatDayIsToday="sunday";
        
        if(whatDayIsToday=="monday") {
        	System.out.println("It's first day of the week");
        }else if(whatDayIsToday=="tuesday") {
        	System.out.println("It's second day of the week");
        }else if(whatDayIsToday=="wednesday") {
        	System.out.println("It's third day of the week");
        }else if(whatDayIsToday=="thursday") {
        	System.out.println("It's forth day of the week");
        }else if(whatDayIsToday=="friday") {
        	System.out.println("It's fifth day of the week");
        }else if(whatDayIsToday=="saturday") {
        	System.out.println("It's sixth day of the week");
        }else if(whatDayIsToday=="sunday") {
        	System.out.println("It's seventh day of the week");
        }else {
        	System.out.println("Invalid day");
        }
        
        }
	}

	


