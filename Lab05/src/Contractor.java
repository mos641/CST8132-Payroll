//Name: 		Mostapha A
//Class: 		CST8132
//Assessment:	Lab 5
//Description: Class for a a Contractor employee, implementing the Employee Class

import java.util.Scanner;

/**
 * @author Mostapha A
 * @version 1.0
 * @since 1.8
 */
public class Contractor implements Employee {
	// the tax rate for Regular Employees, double for hours, hourly rate, pay and string for name
	private static double taxRate;
	private double hours;
	private double hourlyRate;
	private double pay;
	private String name;

	// constructor that sets tax rate
	public Contractor() {
		taxRate = 0.15;
	}

	// method to read account details
	/**
	 * A method to take input and save the employee details.
	 */
	public void readDetails(Scanner input) {
		// ask for information and store in variables
		System.out.print("Enter name: ");
		name = input.next();

		System.out.print("Enter hourly rate: ");
		hourlyRate = input.nextDouble();
		
		System.out.print("Enter hours worked: ");
		hours = input.nextDouble();
	};

	// method to perform calculations
	/**
	 * Performs all necessary calculations.
	 */
	public double payrollCalculations() {
		// variable to store remit
		double remit;

		// calculate pay and remit
		pay = (hours * hourlyRate);
		remit = (pay * taxRate);

		// return remit
		return remit;
	};

	// method to print details
	/**
	 * A method to gather and print all the details including the final
	 * calculations.
	 */
	public void printDetails() {
		// use the payrollCalculations to calculate and return the remit and print
		System.out.println(Employee.compName + " mailed a cheque to " + name + 
				" for " +pay+ ". Tax amount to remit: " + payrollCalculations()+".");
	};
}