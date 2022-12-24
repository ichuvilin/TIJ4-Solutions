package operators;

import java.util.Date;
import static lib.Print.*;

public class E01_PrintStatements {
    public static void main(String[] args) {
        Date curr = new Date();
        System.out.println("Hello, it's: " + curr);
        print("Hello, it's: " + curr);
    }
}
