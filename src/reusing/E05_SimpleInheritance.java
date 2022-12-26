package reusing;

class A {
    public A() {
        System.out.println("A constructor called");
    }
}

class B {
    public B() {
        System.out.println("B constructor called");
    }
}

class C extends A {
    B b = new B();
}

public class E05_SimpleInheritance {
    public static void main(String[] args) {
        new C();
    }
}
