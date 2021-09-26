import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */


//        Zad 1.

        boolean a = true;
        boolean b = false;
        boolean c = true;

        int x = 10;
        int y = 15;
        int z = 10;

        System.out.println("x is " + x + " y is " + y + " z is " + z);

        System.out.println("(y > z) && (4 > 5): " + ((y > z) && (4 > 5))); //false
        System.out.println("(y > z) && (8 > 5) : " + ((y > z) && 8 > 5)); //true


        System.out.println("(y > z) && (4 > 5): " + ((y > z) || (4 > 5))); //true
        System.out.println("(y > z) && (8 > 5) : " + ((y > z) || 8 > 5)); //true
        System.out.println("(y < z) && (3 > 5) : " + (!(y < z) || (3 > 5))); //true
        System.out.println("(y < z) && (3 > 5) : " + ((y < z) || (3 > 5))); //false

        boolean d = ((y < z) || (3 > 5));
        boolean e = ((y > z) || (4 > 5));
        boolean f = (!(y < z) || (3 > 5));

        System.out.println(f == e);
        System.out.println(f == d);















    }
}
