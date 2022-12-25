package initialization;

/****************** Exercise 19 *****************
 * Write a method that takes a vararg String
 * array. Verify that you can pass either a
 * comma-separated list of Strings or a
 * String[] into this method.
 ************************************************/

public class E19_VarargStringArray {

    static void printStrings(String ...str) {
        for(String s : str) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        printStrings("These", "are", "come", "strings");
        printStrings(new String[] {
            "These", "are", "come", "strings"
        });
    }

}
