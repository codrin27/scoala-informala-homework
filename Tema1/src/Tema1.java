import java.util.Scanner;

public class Tema1 {
    public static void main(String[] args) {
        ex1();
        int ex2 = Ex2_3.maxim();
        int ex3 = Ex2_3.minimum();
        ex4();
        ex5();
        ex6_7();
        //ex8();  Nu am reusit sa il fac
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
            System.out.println("Introduceti numerele in sir:");
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
            System.out.println("Introduceti elementele in sir:");
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

    private static void ex4() {
        Scanner scrie = new Scanner(System.in);
        System.out.println("Scrieti un numar pentru a fi indentificat daca este palindrom(ex:1221):");
        int n = scrie.nextInt();
        int i = 0;
        int aux = n;
        int rev = 0;
        while (n != 0) {
            rev = rev + (n % 10);
            n = n / 10;
            rev = rev * 10;
        }
        rev = rev / 10;
        if (aux == rev) {
            System.out.println("Numarul este palindrom!");
        } else System.out.println("Numarul nu este palindrom!");
    }

    private static void ex5() {
        Scanner scrie = new Scanner(System.in);
        System.out.println("Introduceti numarul maxim pana la care se vor afisa numere prime= ");
        int n = scrie.nextInt();
        for (int i = 2; i <= n; i++) {
            boolean prim = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0)
                    prim = false;
            }
            if (prim) {
                System.out.println(" " + i);
            }
        }
    }

    private static void ex6_7() {
        Scanner scrie = new Scanner(System.in);
        System.out.println("Introduceti latimea dreptunghiului (cm)= ");
        int lat = scrie.nextInt();
        System.out.println("Introduceti lungimea dreptunghiului (cm)= ");
        int lun = scrie.nextInt();
        int area = lat * lun;
        System.out.println("Aria dreptunghiului este= " + area + " cm^2.");
        int per = (2 * lat) + (2 * lun);
        System.out.println("Perimetrul dreptunghiului este= " + per + " cm.");
        System.out.println("Introduceti lungimea laturii unui patrat(cm)= ");
        int l = scrie.nextInt();
        if (l <= 0) {
            System.out.println("Dimensiunea nu este corecta!");
        } else {
            int sup = (l * l);
            System.out.println("Suprafata patratului este= " + sup + " cm^2.");
        }
    }

    private static void ex8() {
        Scanner scrie = new Scanner(System.in);
        System.out.println("Introduceti 3 numere= ");
        int big = Ex2_3.maxim();
        System.out.println("Cel mai mare numar este= " + big);
    }
}


