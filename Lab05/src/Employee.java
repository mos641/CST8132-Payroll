//Name: 		Mostapha A
//Class: 		CST8132
//Assessment:	Lab 5
//Description: Class for a an interface for Employees

import java.util.Scanner;

/**
 * @author Mostapha A
 * @version 1.0
 * @since 1.8
 */

interface Employee {
	// instance variables
	/** The company name that the employees work at */
	String compName = "MostaphaTech";

	// method to read account details
	/**
	 * This method is to set the behavior for the subclasses. A method to take input
	 * and save the employee details.
	 * @param input 
	 */
	public void readDetails(Scanner input);

	// method to perform calculations
	/**
	 * Static method to set behavior and be overridden in subclasses. Performs all
	 * necessary calculations.
	 */
	public double payrollCalculations();

	// method to print details
	/**
	 * This method is to set the behavior for the subclasses. A method to gather and
	 * print all the details including the final calculations.
	 */
	public void printDetails();
}
