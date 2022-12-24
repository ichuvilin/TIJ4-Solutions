package control;

/****************** Exercise 4 ******************
 * Write a program to detect and print prime numbers
 * (integers evenly divisible only by themselves
 * and 1), using two nested for loops and the
 * modulus operator (%).
 ************************************************/
public class E04_FindPrimes {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            boolean primary = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    primary = false;
            }
            if (primary)
                System.out.print(i + " ");
        }
    }
}
