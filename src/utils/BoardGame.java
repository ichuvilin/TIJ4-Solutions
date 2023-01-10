package utils;

class Game {
    public Game(int i) {
        System.out.println("Game constructor");
    }
}

public class BoardGame extends Game {
    public BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}

class Chess extends BoardGame {
    public Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
