package reusing;


import lib.BoardGame;

class ChessWithoutDefCtor extends BoardGame {
//    ChessWithoutDefCtor() {
//        System.out.println("ChessWithoutDefCtor constructor"); --> Error
//        super(11);
//    }

    ChessWithoutDefCtor() {
        super(11);
        System.out.println("ChessWithoutDefCtor constructor");
    }
}

public class E06_ChessWithoutDefCtor {
    public static void main(String[] args) {
        new ChessWithoutDefCtor();
    }
}
