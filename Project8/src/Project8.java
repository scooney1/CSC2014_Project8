/**
 * Author:	Sam Cooney
 * Project:	Project8
 * Date:	Oct 4, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: 
 */

import java.util.Scanner;		// Allows use of Scanner class.
import java.text.DecimalFormat;	// Allows use of DecimalFormat class.

public class Project8 {	// This is UseLetter

	public static void main(String[] args) {
		Box myBox = new Box(80);						// Instantiate obj for class Box.
		Scanner scan = new Scanner(System.in);			// Instantiate obj for class Scanner.
		DecimalFormat fmt = new DecimalFormat("0.00");	// Instantiate obj for class DecimalFormat.
		
		System.out.println("Enter a student's name: ");
		String sname = scan.nextLine();		// Reads in string.
		System.out.println("Enter the student's grade as xx.xx: ");
		double sgrade = scan.nextDouble();	// Reads in double.
		System.out.println("Student Name: " + sname);
		System.out.println("Student Grade: " + fmt.format(sgrade));
		
		Letter myLetter = new Letter(sname,sgrade);		// Instantiate obj for class Letter.
		System.out.println(myLetter);	// Uses toString method in Letter.
		
		System.out.println(myBox);		// Uses toString method in Box.
		
		scan.close();	// Closes scan.
	}

}
