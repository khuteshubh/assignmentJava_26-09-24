//Assignment 1: Validating Age and Income
//Write a program that checks if a person is eligible for a loan based on their age and income.
//Requirements:
//•    A person is eligible if their age is between 18 and 60 and their income is above $25,000.
//•    Use logical && to combine these conditions.


package assign_26;
import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	private double income;
	
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter The person name");
		name = sc.next();
		System.out.println("Enter the age");
		age = sc.nextInt();
		System.out.println("Enter the income");
		income = sc.nextDouble();
		
	}
	
	public void checkLoanEligibility() {
		if((age >=18) && (age<=60) && income >= 25000) {
			System.out.println(name + " is eligible for loan ");
		}
		else {
			System.out.println(name + " is not eligible for loan");
		}
		
		
	}

}
