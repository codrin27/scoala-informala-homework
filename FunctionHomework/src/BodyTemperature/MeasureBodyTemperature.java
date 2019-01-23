package BodyTemperature;

import java.util.Scanner;

class MeasureBodyTemperature {
    public static void main(String[] args) {
        double temp;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your body temperature in Fahrenheit (Normal 97.7–99.5 °F): ");
        temp = in.nextDouble();
        if (temp < 95)
            System.out.println("Hypothermia!!!");
        else {
            System.out.println("Your body temperature in Celsius (Normal 36.5–37.5 °C) = " + temperature(temp));

            if (temperature(temp) > 37.5) {
                System.out.println("You are ill!!!");
            }
        }
    }
    private static double temperature(double t){
        return ((t - 32) * 5) / 9;
    }
}

