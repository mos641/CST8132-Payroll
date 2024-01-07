//Name: 		Mostapha A
//Class: 		CST8132
//Assessment:	Lab 5
//Description: Class for the main method, run all the code from here.

import java.util.Scanner;

/**
 * @author Mostapha A
 * @version 1.0
 * @since 1.8
 */
public class PayrollTest {
	public static void main(String[] args) {
		// scanner
		Scanner input = new Scanner(System.in);
		// instance variables
		int num;

		// ask for how many employees
		System.out.print("How many employees are there: ");
		num = input.nextInt();

		// create Payroll  with acquired information
		Payroll payroll = new Payroll(num);

		// add employees
		payroll.readEmployees(input);
		
		//calculate salaries/taxes and print employees
		payroll.processPayroll();

		// close scanner
		input.close();
	}

}
