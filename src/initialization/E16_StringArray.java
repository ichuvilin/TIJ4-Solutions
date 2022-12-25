package initialization;

/****************** Exercise 16 *****************
 * Assign a string to each element of an array of
 * String objects. Print the array using a for loop.
 ************************************************/
public class E16_StringArray {
    public static void main(String[] args) {
        String[] sa1 = new String[4];
        sa1[0] = "These";
        sa1[1] = "are";
        sa1[2] = "come";
        sa1[3] = "strings";
        for (int i = 0; i < sa1.length; i++) {
            System.out.println(sa1[i]);
        }
        String[] sa2 = {
            "These", "are", "come", "strings"
        };
        for (int i = 0; i < sa2.length; i++) {
            System.out.println(sa2[i]);
        }
    }
}
