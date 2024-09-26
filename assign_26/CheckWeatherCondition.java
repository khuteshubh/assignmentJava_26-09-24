//Assignment 7: Weather Conditions
//        Write a program that determines whether it's safe to go outside based on temperature and weather conditions. The conditions to go outside are:
//        •    Temperature should be between 20°C and 30°C.
//        •    It should not be raining.
//        Requirements:
//        •    Use logical operators && and !.

package assign_26;

public class CheckWeatherCondition {
    public static void main(String args[]){
        WeatherCondition d = new WeatherCondition();
        d.accept();
        d.checkWeatherCondition();

    }
}
