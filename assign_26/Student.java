//Assignment 2: Exam Grading System
//Write a program that determines whether a student passes an exam based on three subjects. A student passes if the average score is at least 60, and none of the individual scores is below 40.
//Requirements:
//•    Use logical operators && and || to combine conditions.




package assign_26;

import java.util.Scanner;

public class Student {
	private String name;
	private int sub1;
	private int sub2;
	private int sub3;
	private int subTot;
	private double avg;
	
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter The student name");
		name = sc.next();
		System.out.println("Enter the subject 1 mark");
		sub1 = sc.nextInt();
		System.out.println("Enter the subject 2 mark");
		sub2 = sc.nextInt();
		System.out.println("Enter the subject 3 mark");
		sub3 = sc.nextInt();
		
	}
	
	public void checkPass() {
		subTot = sub1 + sub2 + sub3;
		avg = subTot/3;
		System.out.println("Subject total is " + subTot);
		System.out.println("Average is " + avg);
		
		
		if((avg >= 60) && (sub1 > 40) && (sub2 > 40) && (sub3 > 40)) {
			System.out.println(name + " is Pass");
		}
		else {
			System.out.println(name + " is fail");
		}
		
	}
	

}
