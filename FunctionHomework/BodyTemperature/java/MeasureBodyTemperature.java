import java.util.Scanner;

/**
 * @author Codrin
 * This program will ask you to enter yuor body temperature in Fehrenheit and will show the temperature in Celsius.
 * Also will tell if you are in Hyporthermia, if your temperature is a normal or close to and if you are ill.
 */
class MeasureBodyTemperature{
    public static void main(String[] args) {
        double temp;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your body temperature in Fahrenheit (Normal 97.7–99.5 °F): ");
        temp = in.nextDouble();
        if (temp < 95)
            System.out.println("Hypothermia!!!");
        else {
            System.out.println("Your body temperature in Celsius (Normal 36.5–37.5 °C) = " + FahrenheitToCelsius.change(temp));

            if (FahrenheitToCelsius.change(temp) > 37.5) {
                System.out.println("You are ill!!!");
            }
        }
    }

}

