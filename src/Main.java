import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */

//      Zad.1 a)
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj Imię: ");
        String imie = scan.next();

        System.out.println("Podaj Nazwisko: ");
        String nazwisko = scan.next();

        System.out.println("Podaj Wiek: ");
        int wiek = scan.nextInt();

        System.out.println("Podaj Indeks: ");
        int indeks = scan.nextInt();

//      Zad.1 b)
        System.out.println("Zadanie numer 1: ");
        System.out.println("Potwierdzenie danych: Imię = " + imie + " Nazwisko = " + nazwisko + " Wiek = " + wiek + " Indeks = " + indeks);
        System.out.printf("Twój imie to %s i naziwsko to %s ,wiek to %d oraz nr indeksu: %d \n", imie, nazwisko, wiek, indeks);





        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */


//      Zad.2


        System.out.println("Zadanie numer 2: ");

        int liczba1 = 5;
        int liczba2 = 11;


        System.out.println(liczba1 + liczba2);
        System.out.println(liczba1 - liczba2);
        System.out.println(liczba1 * liczba2);
        System.out.println(liczba1 / liczba2);
        System.out.println(liczba2 % liczba1);


    }
}
