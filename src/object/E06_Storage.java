package object;

/****************** Exercise 6 ******************
 * Write a program that includes and calls the
 * storage() method defined as a code fragment in
 * this chapter.
 ************************************************/
public class E06_Storage {

    int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        E06_Storage storage = new E06_Storage();
        System.out.println(storage.storage("Hello, world!"));
    }
}
