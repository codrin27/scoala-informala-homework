import java.util.Scanner;
public class Tema1 {
    public static void main(String[] args) {
        ex1();
        int ex2 = Ex2_3.maxim();
        int ex3 = Ex2_3.minimum();
        System.out.println(ex2);
        System.out.println(ex3);
    }

    private static void ex1() {
        int n = (99 * 100) / 2;
        System.out.println("Suma primelor 100 de numere mai mari ca 0 este= " + n);
    }

    private static class Ex2_3 {
        private static int maxim() {
            int max;
            Scanner scrie = new Scanner(System.in);
            System.out.println("Introduceti numarul de elemente al sirului.");
            int n = scrie.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = scrie.nextInt();
            }
            max = array[0];
            for (int i = 1; i < array.length; i++)
                if (max < array[i]) {
                    max = array[i];
                }
            System.out.println("Cel mai mare numar din sirul dumneavoastra este= " + max);
            return max;
        }

        private static int minimum() {
            int min;
            Scanner scrie = new Scanner(System.in);
            System.out.println("Introduceti numarul de elemente al sirului.");
            int n = scrie.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = scrie.nextInt();
            }
            min = array[0];
            for (int i = 1; i < array.length; i++)
                if (min > array[i]) {
                    min = array[i];
                }
            System.out.println("Cel mai mic numar din sirul dumneavoastra este= " + min);
            return min;
        }
    }
}

