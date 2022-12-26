package reusing;

class Simple {
    String s;
    public Simple(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }

    public void setS(String sNew) {
        this.s = sNew;
    }
}

class Second {
    Simple simple;
    String s;
    public Second(String s) {
        this.s = s;
    }

    public void check() {
        if (simple == null) {
            System.out.println("not initialized");
        } else
            System.out.println("initialized");
    }

    public Simple lazy() {
        if (simple == null) {
            System.out.println("Creating Simple");
            simple = new Simple(s);
        }
        return simple;
    }

    public Simple getSimple() {return lazy();}

    @Override
    public String toString() {
        return lazy().toString();
    }

    public void setSimple(String sNew) {
        lazy().setS(sNew);
    }

}

public class E01_Composition {
    public static void main(String[] args) {
        Second second = new Second("Init String");
        second.check();
        System.out.println(second.getSimple());
        second.check();
        System.out.println(second); // toString() call
        second.setSimple("New String");
        System.out.println(second);
    }
}
