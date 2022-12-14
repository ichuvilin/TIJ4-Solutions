package arrays;

class A {}

public class E08_ArrayOfGenerics<T> {
    @SuppressWarnings("unchecked")
    T[] a; // Compile warning: unchecked cast
    public static void main(String[] args) {
        String[] sa = new String[2];
        // sa[0] = new Integer(0); // error: incompatible types
        Object[] oa = new Object[3];
        oa[0] = new String("hi");
        oa[1] = new A(); // arbitrary object OK
        int x = 2;
        oa[2] = x; // Autoboxing converts int to Integer:
        System.out.println("oa[2]: " + oa[2].getClass());
        oa = sa;
        System.out.println("oa: " + oa.getClass());
        // compiles, but Runtime ArrayStoreException:
        // oa[0] = 3;
    }
}
