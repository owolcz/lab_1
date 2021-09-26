import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj Imię: ");
        String imie = scan.next();

        System.out.println("Podaj Nazwisko: ");
        String nazwisko = scan.next();

        System.out.println("Podaj Wiek: ");
        int wiek = scan.nextInt();

        System.out.println("Potwierdzenie danych: Imię =" + imie + " Nazwisko = " + nazwisko + " wiek = " + wiek );
        System.out.printf("Twój imie to %s i naziwsko to %s oraz wiek to %d \n", imie, nazwisko, wiek);





        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

        int liczba1 = 5;
        int liczba2 = 11;


        System.out.println(liczba1 + liczba2);
        System.out.println(liczba1 - liczba2);
        System.out.println(liczba1 * liczba2);
        System.out.println(liczba1 / liczba2);
        System.out.println(liczba2 % liczba1);


    }
}
