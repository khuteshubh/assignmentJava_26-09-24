package assign_26;

import java.util.Scanner;

public class WeatherCondition {
    private int deg;
    private String isRain;


    Scanner sc = new Scanner(System.in);

    public void accept() {
        System.out.println("Enter The temperature");
        deg = sc.nextInt();
        System.out.println("Weather is Rainy");
        isRain = sc.next();



    }

    public void checkWeatherCondition() {
        if((deg >= 20) && (deg <= 30) && (!isRain.equals("yes"))) {
            System.out.println( " Weather is safe ");
        }


        else {
            System.out.println("Weather is Not Safe");
        }


    }

}
