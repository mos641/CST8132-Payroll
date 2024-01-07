//Name: 		Mostapha A
//Class: 		CST8132
//Assessment:	Lab 5
//Description: Class for a the payroll, placing employees in an array and filling said array

import java.util.Scanner;

/**
 * @author Mostapha A
 * @version 1.0
 * @since 1.8
 */
public class Payroll {
	//array
	private Employee[] employees;

	// parameterized constructor
	Payroll(int size) {
		// set array size
		employees = new Employee[size];
	}

	// method to read in multiple employees
	public void readEmployees(Scanner input) {
		// for loop to fill array with accounts
		for (int i = 0; i < employees.length; i++) {
			// variable to store input
			int type;

			//loop to validate input
			do {
				// ask for account type
				System.out.print("1.  Regular\n" + "2.  Contractor\n" + 
						"Enter the type of employee: ");
				type = input.nextInt();
				
				//if its not 1 or 2 give an error message
				if(type > 2 || type < 0)
				System.out.println("Invalid type... please try again");
				
				//condition if its not the two inputs loop again
			}while(type != 1 || type != 2);
			
			// determine which array object needs to be created based on employee type
			if (type == 1) {
				// if they selected Regular type, create a Regular
				employees[i] = new Regular();
			} else {
				// if they selected Contractor type, create a Contractor
				employees[i] = new Contractor();
			}
			// call method to read info
			employees[i].readDetails(input);
		}
	}

	// method to calculate/update balances
	public void processPayroll() {
		// for loop to run calculate and print for all employees
		for (int i = 0; i <= employees.length; i++) {
			employees[i].printDetails();
		}
	}

}
