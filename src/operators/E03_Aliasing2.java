package operators;

public class E03_Aliasing2 {
    static void f (Integral i) {
        i.f = 5;
    }

    public static void main(String[] args) {
        Integral i = new Integral();
        i.f = 10;
        System.out.println("1: i.f = " + i.f);
        f(i);
        System.out.println("2: i.f = " + i.f);
    }

}
