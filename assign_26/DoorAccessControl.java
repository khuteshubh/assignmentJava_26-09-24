//Assignment 3: Door Access Control
//Write a program that simulates an access control system. A person is allowed access if they have both a valid ID and a valid access card, or if they are an admin.
//Requirements:
//•    Use logical operators &&, ||, and !.


package assign_26;

import java.util.Scanner;

public class DoorAccessControl {
	private String name;
	private String validId;
	private String accessCard;
	private boolean isAdmin;

	DoorAccessControl(){
		isAdmin = true;
	}

	
	
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter The person name");
		name = sc.next();
		
		System.out.println("person have ID ");
		validId = sc.next();

		System.out.println("Person have access Card");
		accessCard = sc.next();

		
		
	}
	
	public void checkAdmin() {

		if(!validId.equals("yes") && !accessCard.equals("yes")){
			isAdmin = false;
		}
		
		if((isAdmin) == true ) {

			System.out.println(name + " Access Granted ");
		}
		else {

			System.out.println(name + "Access denial");
		}
		
	}
}
	 


