package initialization;

/****************** Exercise 2 *****************
 * Create a class with a String field initialized
 * at the point of definition, and another one
 * initialized by the constructor. What is the
 * difference between the two approaches?
 ***********************************************/
public class E02_StringInitialization {
    String s1 = "Initialized at definition";
    String s2;

    public E02_StringInitialization(String s) {
        s2 = s;
    }

    public static void main(String[] args) {
        E02_StringInitialization sti =
                new E02_StringInitialization("Initialized at construction");
        System.out.println("sti.s1 = " + sti.s1);
        System.out.println("sti.s2 = " + sti.s2);
    }
}
