import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */


//        Zad.1
        byte var1 = 127;
        short var2 = 22222;
        int var3 = -2147483648;
        long var4 = 3234234;
        float var5 = 22.15f;
        double var6 = 45.1231232;
        char var7 = 't';
        boolean var8 = true;
        String var9 = "Hello world!";

        System.out.println("byte = " + var1 + " short = " + var2 + " int = " + var3 + " long = " + var4 + " float = " + var5 + " double = " + var6 + " char = " + var7 + " boolean = " + var8 + " String = " + var9);

        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */

//    Zad.2
//      a)
        int liczbaA = 10;
        int liczbaB = 15;

        int dodawanie = liczbaA + liczbaB;
        int odejmowanie = liczbaA - liczbaB;
        int mnozenie = liczbaA * liczbaB;
        int dzielenie = liczbaB / liczbaA;
        int modulo = liczbaB % liczbaA;
            System.out.println("Działania na liczbach A = " + liczbaA + " B = " +liczbaB);
        System.out.printf("Wynik dodawania = %d ; Wynik odejmowania = %d ; Wynik mnożenia = %d; Wynik dzielenia = %d; Wynik modulo = %d; \n", dodawanie, odejmowanie, mnozenie, dzielenie, modulo);

//      b)
        double liczbaX = 10.5;
        double liczbaY = 15.2;

        double dodawanie1 = liczbaX + liczbaY;
        double odejmowanie1 = liczbaX - liczbaY;
        double mnozenie1 = liczbaX * liczbaY;
        double dzielenie1 = liczbaY / liczbaX;
        double modulo1 = liczbaY % liczbaX;
        System.out.println("Działania na liczbach X = " + liczbaX + " Y = " +liczbaY);
        System.out.printf("Wynik dodawania = %f ; Wynik odejmowania = %f ; Wynik mnożenia = %f; Wynik dzielenia = %f; Wynik modulo = %f; \n", dodawanie1, odejmowanie1, mnozenie1, dzielenie1, modulo1);

    }
}
