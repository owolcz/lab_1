import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */

//        Zad.1
//        Sposób a)
//        Stworzenie tablicy:
        double[] tablica = new double[5];

//        Przypisanie wartości za pomocą petli for:
        for(int i=0; i< tablica.length; i ++)

        {
            tablica[i] = i + 1.52;

            System.out.println("Kolejna liczba tablicy to: " + tablica[i]);

        }

//        Sposób b)
        double[] tablica2 = new double[5];
        tablica2[0] = 1.234234;
        tablica2[1] = 531213.4;
        tablica2[2] = 4.23234;
        tablica2[3] = 13333.234234;
        tablica2[4] = 51253121.2324134234;

        System.out.println("Tablica numer 2: ");
        System.out.println(tablica2[0]);
        System.out.println(tablica2[1]);
        System.out.println(tablica2[2]);
        System.out.println(tablica2[3]);
        System.out.println(tablica2[4]);

//        Sposób c)
        double[] tablica3 = {123.5, 1231231123123.5, -12.6, 133.7, 42.0};

        System.out.println("Tablica numer 3: ");
        System.out.println(tablica3[0]);
        System.out.println(tablica3[1]);
        System.out.println(tablica3[2]);
        System.out.println(tablica3[3]);
        System.out.println(tablica3[4]);

    }
}
