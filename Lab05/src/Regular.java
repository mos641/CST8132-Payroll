//Name: 		Mostapha A
//Class: 		CST8132
//Assessment:	Lab 5
//Description: Class for a a Regular employee, implementing the Employee Class

import java.util.Scanner;

/**
 * @author Mostapha A
 * @version 1.0
 * @since 1.8
 */

public class Regular implements Employee {
	// the tax rate for Regular Employees, double for salary and string for name
	private static double taxRate;
	private double salary;
	private String name;

	// constructor sets the tax rate
	public Regular() {
		taxRate = 0.31;
	}

	// method to read account details
	/**
	 * A method to take input and save the employee details.
	 */
	public void readDetails(Scanner input) {
		// ask for information and store in variables
		System.out.print("Enter name: ");
		name = input.next();

		System.out.print("Enter annual salary: ");
		salary = input.nextDouble();
	};

	// method to perform calculations
	/**
	 * Performs all necessary calculations.
	 */
	public double payrollCalculations() {
		// variable to store calculated salary
		double taxedSalary;

		// calculate salary
		taxedSalary = salary - (salary * taxRate);

		// return salary
		return taxedSalary;
	};

	// method to print details
	/**
	 * A method to gather and print all the details including the final
	 * calculations.
	 */
	public void printDetails() {
		// use the payrollCalculations to calculate and return the salary and print
		System.out.println(Employee.compName + " deposited " + payrollCalculations() + 
				" to " + name + "'s account.");
	};
}