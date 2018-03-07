/**
 * Author:	Sam Cooney
 * Project:	Project8
 * Date:	Oct 4, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: 
 */

import java.text.DecimalFormat; // Allows use of DecimalFormat.

public class Letter {			// Beginning of class. 
	DecimalFormat fmt = new DecimalFormat("0.00");
	String name;
	double grade;
	
	public Letter(String p1, double p3) {			// Constructor method.
		
		name = p1;	// Placing values in global variables.
		grade = p3;	// Placing values in global variables.
	}	// End constructor.
	
	public String toString() {						// toString method.
		
		return("Dear " + name + ", Congratulations.\nYour grade point average is: " + fmt.format(grade));
		// Returns a string when sop(obj); is executed.
	}
}	// End class.
