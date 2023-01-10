package reusing;

import utils.Cartoon;

class CartoonWithDefCtor extends Cartoon {
    CartoonWithDefCtor() {
        System.out.println("CartoonWithDefCtor constructor");
    }
}

public class E03_CartoonWithDefCtor {
    public static void main(String[] args) {
        new CartoonWithDefCtor();
    }
}
