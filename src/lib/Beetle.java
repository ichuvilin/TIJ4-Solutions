package lib;

import static lib.Print.print;

public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }

    private static int x2 =
            printInit("static Beetle.x2 initialized");

}
