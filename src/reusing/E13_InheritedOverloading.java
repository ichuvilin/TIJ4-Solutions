package reusing;

class ThreeOverloads {
    public void f(int i) {
        System.out.println("f(int i)");
    }

    public void f(char c) {
        System.out.println("f(char c)");
    }


    public void f(double d) {
        System.out.println("f(double d)");
    }
}

class MoreOverloads extends ThreeOverloads {
    public void f(String s) {
        System.out.println("f(String s)");
    }
}

public class E13_InheritedOverloading {
    public static void main(String[] args) {
        MoreOverloads m = new MoreOverloads();
        m.f(1);
        m.f('c');
        m.f(4.4);
        m.f("H");
    }
}
