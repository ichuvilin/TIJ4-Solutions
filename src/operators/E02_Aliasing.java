package operators;

/****************** Exercise 2 *****************
 * Create a class containing a float and use it to
 * demonstrate aliasing.
 ***********************************************/
class Integral {
    float f;
}

public class E02_Aliasing {
    public static void main(String[] args) {
        Integral i1 = new Integral();
        Integral i2 = new Integral();
        i1.f = 12;
        i2.f = 47;
        System.out.println("1: i1.f: " + i1.f + ", i2.f: " + i2.f);
        i1 = i2;
        System.out.println("2: i1.f: " + i1.f + ", i2.f: " + i2.f);
        i1.f = 55;
        System.out.println("3: i1.f: " + i1.f + ", i2.f: " + i2.f);
    }
}
