package employeetest;

import java.util.Scanner;

class Employee {
	private String first_name;			
	private String last_name;
	private Double monthly_salary;
	
	public Employee(String first_name, String last_name, Double monthly_salary) {		// Constructor
		this.first_name = first_name;
		this.last_name = last_name;
		if (monthly_salary > 0) {
			this.monthly_salary = monthly_salary;
		}
	}
	
	public void setFirstName(String first_name) {			// Setters for all variables
		this.first_name = first_name;
	}
	
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}
	
	public void setSalary(Double monthly_salary) {
		if (monthly_salary > 0) {
			this.monthly_salary = monthly_salary;
		}
	}
	
	public String getFirstName() {			// Getters for all variables
		return this.first_name;
	}
	 
	public String getLastName() {
		return this.last_name;
	}
	
	public Double getSalary() {
		return this.monthly_salary;
	}
}

public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);			// Declaring variables
		Employee employee1 = new Employee("John", "Lennon", (double) 1);
		Employee employee2 = new Employee("Samantha", "Rodrigez", (double) 12345);
														// Printing the employee details list
		System.out.println("These are the employees employed at our company: \n1. " + employee1.getFirstName() + " " 
		+ employee1.getLastName() + "; Salary: $" + employee1.getSalary() + "\n2. " + employee2.getFirstName() + " "
		+ employee2.getLastName() + "; Salary: $" + employee2.getSalary());
														// Reassigning the details of the second employee
		System.out.println("\nThere has been an error processing the second employee. Please correct the second employee's details: ");
		
		System.out.print("First name: ");
		employee2.setFirstName(input.nextLine());
		
		System.out.print("Last name: ");
		employee2.setLastName(input.nextLine());
		
		System.out.print("Monthly salary: ");
		employee2.setSalary(input.nextDouble());
														// Printing the new employee details list
		System.out.println("\nThese are the employees employed at our company: \n1. " + employee1.getFirstName() + " " 
				+ employee1.getLastName() + "; Salary: $" + employee1.getSalary() + "\n2. " + employee2.getFirstName() + " "
				+ employee2.getLastName() + "; Salary: $" + employee2.getSalary());
														// Printing their yearly salary
		System.out.printf("\nThe yearly salary for employee 1 is: $%.2f\n", employee1.getSalary() * 12);
		System.out.printf("The yearly salary for employee 2 is: $%.2f\n", employee2.getSalary() * 12);
														// Printing their yearly salary after a 10% raise
		System.out.println("\nThey've been very good employees. We've decided to give them a 10% raise.\nTheir new yearly salaries are: ");
		System.out.println("Employee 1: $" + (employee1.getSalary() * 1.2 + employee1.getSalary() * 12));
		System.out.println("Employee 2: $" + (employee2.getSalary() * 1.2 + employee2.getSalary() * 12));
	}
}
