import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */

//        Zad.1

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj Wiek: ");
        int wiek = scan.nextInt();

        System.out.println("Podaj Indeks: ");
        int indeks = scan.nextInt();



            if(wiek % 3 == 0)
            {
                System.out.println("Wiek podzielny przez 3");
            }
            else
            {
                System.out.println("Wiek niepodzielny przez 3");
            }




        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */


//         Zad.2

            String parzystosc_indeksu = (indeks % 2 == 0) ? "Indeks parzysty" : "Indeks nie parzysty";
            System.out.println(parzystosc_indeksu);




        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

//        Zad.3


        System.out.println("Podaj liczbę zmiennoprzecinkową: ");
        float liczba = scan.nextFloat();

        if (liczba < 10.5)
        {
            System.out.println("Liczba mniejsza 10,5");
        }
        else if(liczba == 10.5)
        {
            System.out.println("Liczba równa 10,5");
        }
        else
        {
            System.out.println("Liczba większa 10,5");
        }

    }
}
