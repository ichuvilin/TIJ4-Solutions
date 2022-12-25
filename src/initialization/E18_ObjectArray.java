package initialization;

/****************** Exercise 18 *****************
 * Create objects to attach to the array of
 * references for Exercise 17.
 ************************************************/
public class E18_ObjectArray {
    public static void main(String[] args) {
        Test[] arr = new Test[5];
        for (int i = 0; i  < arr.length; i++) {
            arr[i] = new Test(Integer.toString(i));
        }
    }
}
