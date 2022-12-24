package operators;

/****************** Exercise 4 *****************
 * Write a program that calculates velocity
 * using a constant distance and a constant time.
 ***********************************************/
public class E04_Velocity {
    public static void main(String[] args) {
        float distance = 30.5f;
        float time = 3.2f;
        System.out.print("Velocity = ");
        System.out.print(distance / time  );
        System.out.println(" m/s");
    }
}
