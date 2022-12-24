package operators;

class Dog {
    String name;
    String say;
}

public class E05_Dogs {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "Spot";
        dog1.say = "Ruff!";
        dog2.name = "Scruffy";
        dog2.say = "Wurf!";

        System.out.println(dog1.name + " say " + dog1.say);
        System.out.println(dog2.name + " say " + dog2.say);
    }
}
