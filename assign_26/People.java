//Assignment 4: Voting Eligibility
//        Write a program that checks if a person is eligible to vote. A person can vote if they are a citizen and their age is 18 or above.
//        Requirements:
//        •    Use logical && to combine conditions, and ! to negate conditions if necessary.

package assign_26;
import java.util.*;

public class People {
    private String name;
    private int age;
    private String isCitizen;
    Scanner sc = new Scanner(System.in);

    public void accept(){
        System.out.println("Enter the voter name");
        name = sc.nextLine();
        System.out.println("Enter the age ");
        age = sc.nextInt();
        System.out.println("It is citizen of this country");
        isCitizen = sc.next();


    }

    public void checkEligibility(){
        if((age >= 18) && (isCitizen.equals("yes"))){
            System.out.println(name + " eligible for voting");
        }

        else
        {
            System.out.println(name + " Not eligible for voting");
        }
    }


}
