package TheTime;

import java.util.Scanner;

public class DataValidation {
    public static void main(String []args ) {
        Scanner s = new Scanner(System.in);
        System.out.println("What time is it? ");
        System.out.println("Enter the hour: ");
        int h = s.nextInt();
        System.out.println("Enter the minutes: ");
        int m = s.nextInt();
        if (valid(h , m)) {
            System.out.println("The time is  " + h + ":" + m + " now." );
        } else {
            System.out.println("Incorrect time!");
        }
    }

    private static boolean valid(int a, int b)
    {
        return (a >= 0 && a <= 23 && b >= 0 && b <= 59);
    }
}