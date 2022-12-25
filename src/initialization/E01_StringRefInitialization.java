package initialization;

/****************** Exercise 01 ****************
 * Create a class with an uninitialized
 * String reference. Demonstrate that this
 * reference is initialized by Java to null.
 ***********************************************/
public class E01_StringRefInitialization {
    String s;
    public static void main(String[] args) {
        E01_StringRefInitialization sti =
                new E01_StringRefInitialization();
        System.out.println("sti.s = " + sti.s);
    }
}
