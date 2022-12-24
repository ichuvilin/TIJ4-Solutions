package object;


/****************** Exercise 1 *****************
 * Create a class containing an int and a char
 * that are not initialized. Print their values
 * to verify that Java performs default
 * initialization.
 ***********************************************/
public class E01_DefaultInitialization {
    static int i;
    static char c;
    public static void main(String[] args) {
        System.out.println("i = " + i);
        System.out.println("c = " + c );
    }

}
