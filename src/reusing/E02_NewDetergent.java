package reusing;

import lib.Detergent;


class NewDetergent extends Detergent {
    @Override
    public void scrub() {
        append(" E02_NewDetergent.scrub()");
        super.scrub();
    }

    public void sterilize() {
        append(" sterilize()");
    }
}

public class E02_NewDetergent {
    public static void main(String[] args) {
        NewDetergent x = new NewDetergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.sterilize();
        System.out.println(x);
    }
}
