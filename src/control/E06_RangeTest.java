package control;

/****************** Exercise 6 ******************
 * Modify the two test() methods in the previous
 * two programs so they take two extra
 * arguments, begin and end, and so testval is
 * tested to see if it is within the range between
 * (and including) begin and end.
 ************************************************/
public class E06_RangeTest {
    static boolean test(int testval, int begin, int end) {
        if(testval >= begin && testval <= end)
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(test(10, 5, 15));
        System.out.println(test(5, 10, 15));
        System.out.println(test(5, 5, 5));
    }
}
