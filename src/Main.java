import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - przyklad_6 */

        /* Deklarowanie i inicjalizacja tablic */
        int[] tab1 = {1, 2, 4, 7, 9};
        boolean[] tab2 = new boolean[10];
        String[] tab3 = new String[]{"Ala", "Basia", "Romek"};
        char[] tab4;

        /* drógi sposób inicjalizowania tablic */
        int[] tab5 = new int[4];
        tab5[0] = 1;
        tab5[1] = 2;
        tab5[2] = 3;
        tab5[3] = 4;
        System.out.println(tab5.length); // 4

        /* wyświetlanie elementów tablicy */
        System.out.println("tab5: " + tab5); // [I@776ec8df
        System.out.println("tab5[0]: " + tab5[0]); // tab5[0]: 1
        System.out.println("tab5[1]: " + tab5[1]); // tab5[1]: 2

        /* przykład przypisania wartości w pętli for */
        int[] tab6 = new int[4];
        for (int i = 0; i < tab6.length; i++) {
            tab6[i] = i + 3;
        }

        /* przykład wyświetlania wartości w pętli for */
        for (int i = 0; i < tab6.length; i++) {
            System.out.print(tab6[i] + " "); // 3 4 5 6
        }
    }
}
