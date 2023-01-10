package utils;

import static utils.Print.print;

public class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        print("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 =
            printInit("static Insect.x1 initialized");

    protected static int printInit(String s) {
        print(s);
        return 47;
    }
}