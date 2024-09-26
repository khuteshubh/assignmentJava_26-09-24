package assign_26;

import java.util.Scanner;

public class Number {
    private int num;


    Scanner sc = new Scanner(System.in);

    public void accept() {
        System.out.println("Enter The number");

        num = sc.nextInt();


    }

    public void checkValidNo() {
        if((num >10) && (num<20) ) {
            System.out.println(num + " is between 10 and 20 ");
        }
        else {
            System.out.println(num + " is not between 10 and 20");
        }


    }

}
