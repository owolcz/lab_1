import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Operatory logiczne */
        boolean a = true;
        boolean b = false;
        boolean c = true;
        System.out.println("Operatory arytmetyczne:" +
                "\na = true\tb = false\tc = true");

        /* Iloczyn logiczny - AND */
        System.out.println("a && b: " + (a && b)); // false
        System.out.println("a && c: " + (a && c)); // true

        /* Różnica logiczna - OR */
        System.out.println("a || b: " + (a || b)); // true
        System.out.println("a || c: " + (a || c)); // true
        System.out.println("false || b: " + (false || b)); // false


        /* zaprzeczenie  - NOT */
        System.out.println("!a: " + !a); // false
        System.out.println("!b: " + !b); // true

        /* łączenie operatorów */
        System.out.println("!(a && b): " + !(a && b)); // true
        System.out.println("!((a && c) || (!a || b): " + !((a && c) || (!a || b))); // false

        System.out.println();

        /* Operatory porównania */
        int x = 5;
        int y = 7;
        int z = 5;

        /* \t - dodaje tabulator, \n - przeżuca kursor na początek nowej linii */
        System.out.printf("Operatory porównania:" +
                "\nx = %d\ty = %d\tz = %d\n", x, y, z);

        /* porównanie */
        System.out.println("x == y: " + (x == y)); // false
        System.out.println("x == z: " + (x == z)); // true

        /* nierówne */
        System.out.println("x != y: " + (x != y)); // true
        System.out.println("x != z: " + (x != z)); // false

        /* pozostałe operatory */
        System.out.println("x > y: " + (x > y)); // false
        System.out.println("x < y: " + (x < y)); // true
        System.out.println("y >= x: " + (y >= x)); // true

        System.out.println("(x > y) || (a && b): " + ((x > y) || (a && c))); // true

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów */
    }
}
