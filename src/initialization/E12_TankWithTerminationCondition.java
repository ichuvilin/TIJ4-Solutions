package initialization;

/********************* Exercise 12 ********************
 * Create a class called Tank that can be filled
 * and emptied, with a termination condition that it
 * must be empty when the object is cleaned up.
 * Write a finalize() that verifies this termination
 * condition. In main(), test the possible
 * scenarios that can occur when you use Tank.
 ******************************************************/


class Tank {
    static int counter = 0;
    int id = counter++;
    boolean full;

    public Tank() {
        System.out.println("Tank " + id + " created");
        full = true;
    }

    public void empty() {
        full = false;
    }

    @Override
    protected void finalize() {
        if (full)
            System.out.println("Error: tank " + id + " must be empty at cleanup");
        else
            System.out.println("Tank " + id + " cleaned up OK");
    }

    @Override
    public String toString() {
        return "Tank " + id;
    }
}

public class E12_TankWithTerminationCondition {
    public static void main(String[] args) {
        new Tank().empty();
        new Tank();
        System.gc();
        System.runFinalization();
    }
}
