package operators;

import static utils.Print.print;

/****************** Exercise 6 *****************
 * Following Exercise 5 assign, a new Dog
 * reference to spot's object. Test for comparison
 * using == and equals() for all references.
 ***********************************************/
public class E06_DogsComparison {

    static void compare(Dog dog1, Dog dog2) {
        print("== on top references: " + (dog1 == dog2));
        print(
                "equals() on top references: " + dog1.equals(dog2)
        );
        print("== on names: " + (dog1.name == dog2.name));
        print(
                "equals() on names: " + dog1.name.equals(dog2.name)
        );
        print("== on says: " + (dog1.say == dog2.say));
        print(
                "equals() on says: " + dog1.say.equals(dog2.say)
        );
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = dog1; // "Aliased" reference
        dog1.name = "spot";
        dog1.say = "ruff!";
        dog2.name = "scruffy";
        dog2.say = "wurf!";
        print("Comparing dog1 and dog2 objects...");
        compare(dog1, dog2);
        print("\nComparing dog1 and dog3 objects...");
        compare(dog1, dog3);
        print("\nComparing dog2 and dog3 objects...");
        compare(dog2, dog3);
    }

}
