import java.util.Scanner;
public class Tema1 {
    public static void main(String[] args) {
        ex1();
        ex2();
    }
    private static void ex1(){
        int n = (99 * 100) / 2;
        System.out.println("Suma primelor 100 de numere mai mari ca 0 este= " + n);
    }
    private static void ex2(){
        int max;
        Scanner scrie = new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente al sirului.");
        int n = scrie.nextInt();
        int[] array;
        array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = scrie.nextInt();
        }
        max = array[0];
        for (int i = 1; i <= n; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Cel mai mare numar din sirul dumneavoastra este= "+ max);
    }
}
