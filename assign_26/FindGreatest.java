package assign_26;

import java.util.Scanner;

public class FindGreatest {
    private int num1;
    private int num2;
    private int num3;


    Scanner sc = new Scanner(System.in);

    public void accept() {
        System.out.println("Enter the first number");
        num1 = sc.nextInt();
        System.out.println("Enter the second number");
        num2 = sc.nextInt();
        System.out.println("Enter the third number");
        num3 = sc.nextInt();


    }

    public void checkGreatestNo() {
        if((num1 >num2) && (num1 > num3) ) {
            System.out.println(num1 + " is Greatest Number ");
        }

        else if((num2 > num1) && (num2 > num3)) {
            System.out.println(num2 + " is Greatest Number");
        }
        else{
            System.out.println(num3 + " is Greatest Number");
        }


    }
}
