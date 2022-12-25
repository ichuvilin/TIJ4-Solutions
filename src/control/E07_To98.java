package control;

import static lib.Print.*;


public class E07_To98 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 99) break;
            printnb(i + " ");
        }
    }
}
