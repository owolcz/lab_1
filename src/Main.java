import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmienna = 7;
        /* pojedynczy if, kod z wewnątrz if-a jest wykonywany tylko gdy warunek jest prawdziwy,
         * w innym wypadku kod jest pomijany przez program */
        if (zmienna <= 10) {
            System.out.println("1) zmienna jest mniejsza od 10");
        }

        /* konstrukcja else jest wykonywana tylko wtedy gdy wartość w if-ie jest nieprawdziwa,
         * w innym wypadku kod z else-a jest pomijany */
        if (zmienna > 10) {
            System.out.println("2) zmienna jest wieksza od 10");
        } else {
            System.out.println("2) zmienna jest <= 10");
        }

        /* parametr trójargumentowy działa jak if else ale zapis w niektórych przypadkach
         * jest bardziej estetyczny lub czytelny */
        int wynik = (zmienna % 2 == 0) ? 0 : 1;
        System.out.println("3) wynik: " + wynik);

        /* Konstrukcja else if */
        if (zmienna < 5) {
            System.out.println("4) zmienna < 5");
        } else if (zmienna > 15) {
            System.out.println("4) zmienna > 15");
        } else if (zmienna == 10) {
            System.out.println("4) zmienna == 10");
        } else {
            System.out.println("5) wykonał sie else, zmienna > 5 i < 15 i !10");
        }

    }
}
