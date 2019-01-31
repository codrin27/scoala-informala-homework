import java.util.Scanner;

/**
 * @author Codrin
 * This program will calculate the biggest number of 3 numbers at choise.
 */
public class CalculateMax {
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        System.out.println("Enter the second number: ");
        int b = keyboard.nextInt();
        System.out.println("Enter the third number: ");
        int c = keyboard.nextInt();
        System.out.println("Your biggest number is: " + Max.getMax(Max.getMax(a , b), c));
    }
}
