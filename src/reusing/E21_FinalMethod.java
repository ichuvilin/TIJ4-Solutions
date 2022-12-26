package reusing;

class WithFinalMethod {
    final void f() {
    }
}

public class E21_FinalMethod extends WithFinalMethod {
//    void f() {
//      !!! Error
//    }

    public static void main(String[] args) {

    }
}
