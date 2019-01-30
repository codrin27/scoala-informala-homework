import java.util.Scanner;

/**
 * author: Codrin
 *
 * The program
 */
public class Tema1 {
    public static void main(String[] args) {
        ex1();
        Ex2_3.minimum();
        Ex2_3.maxDigit();
        ex4();
        ex5();
        ex6_7();
        ex8();
        ex9();
    }

    private static void ex1() {
        int n = (99 * 100) / 2;
        System.out.println("Suma primelor 100 de numere mai mari ca 0 este= " + n);
    }

    /**
     * This class use 2 methods (maxDigit and minimum), maxDigit is displaying the biggest digit from a number.
     * And "minimum" is displaying the smallest number from an array of numbers.
     * I thought i can use this 2 methods in other exercices and i created a class.
     */
    private static class Ex2_3 {
        private static void maxDigit() {
            Scanner scrie = new Scanner(System.in);
            System.out.println("Introduceti un numar: ");
            int n = scrie.nextInt();
            int maxD = n % 10;
            int aux = n;
            n = n / 10;
            while (n != 0){
                if(maxD < n % 10)
                    maxD = n % 10;
                n /= 10;
            }
            System.out.println("Ce mai mare cifra a numarului " + aux + " este = " + maxD);
        }

        private static void minimum() {
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
        }
    }

    private static void ex4() {
        Scanner scrie = new Scanner(System.in);
        System.out.println("Scrieti un numar pentru a fi indentificat daca este palindrom(ex:1221):");
        int n = scrie.nextInt();
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
        System.out.println("a= ");
        int a = scrie.nextInt();
        System.out.println("b= ");
        int b = scrie.nextInt();
        System.out.println("c= ");
        int c = scrie.nextInt();
        if (a > b) {
            if (a > c)
                System.out.println("Cel mai mare numar este= " + a);
            else System.out.println("Cel mai mare numar este= " + c);
        } else if (b > c)
            System.out.println("Cel mai mare numar este= " + b);
        System.out.println("Cel mai mare numar este= " + c);
    }
    private static void ex9(){
        Scanner scrie = new Scanner(System.in);
        System.out.println("Introduceti capetele intervalului.");
        System.out.println("s= ");
        int s = scrie.nextInt();
        System.out.println("f= ");
        int f = scrie.nextInt();
        if (s > f) {
            int aux = s;
            s = f;
            f = aux;
        }
        while (s <= f){
            System.out.println(s + " ");
            s++;
        }
    }
}


