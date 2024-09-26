package assign_26;

import java.util.Scanner;

public class Job {
    private String name;
    private String degree;
    private String record;
    private String experi;

    Scanner sc = new Scanner(System.in);

    public void accept() {
        System.out.println("Enter The name");
        name = sc.next();
        System.out.println("Do you have bachelor degree");
        degree = sc.next();
        System.out.println("Do you have equivalent experience");
        experi = sc.next();
        System.out.println("Do you have clean criminal record");
        record = sc.next();


    }

    public void checkJob() {
        if((degree.equals("yes")) && (record.equals("yes")) && (experi.equals("yes"))) {
            System.out.println(name + " is eligible for Job");
        }
        else {
            System.out.println(name + " is not eligible for Job");
        }


    }

    public void display(){
        System.out.println("name is" + name);

    }


}
