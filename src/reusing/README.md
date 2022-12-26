# Chapter 7 Quest Navigation

### Exercise 1
    Create a simple class. Inside a second class,
    define a reference to an object of the first
    class. Use lazy initialization to instantiate
    this object.
[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E01_Composition.java)

---

### Exercise 2
    Inherit a new class from class Detergent.
    Override scrub() and add a new method called
    sterilize(). 
[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E02_NewDetergent.java)

---

### Exercise 3
    Even if you don't create a constructor for
    Cartoon(), the compiler will synthesize a
    default constructor that calls the base-class
    constructor. Prove that assertion.
[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E03_CartoonWithDefCtor.java)

---

### Exercise 4
    Prove that base-class constructors are (a)
    always called and (b) called before
    derived-class constructors.
  [Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E04_ConstructorOrder.java)

---

### Exercise 5
    Create classes A and B with default
    constructors (empty argument lists) that
    announce themselves. Inherit a new class
    called C from A, and create a member of class
    B inside C. Do not create a constructor for C.
    Create an object of class C and observe the
    results. 
[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E05_SimpleInheritance.java)

---

### Exercise 6
    If you don’t call the base-class constructor
    in BoardGame(), the compiler will respond
    that it can’t find a constructor of the form
    Game(). The call to the base-class
    constructor must be the first thing you do
    in the derived-class constructor. (The compiler
    will remind you if you get it wrong.)
    Use Chess.java to prove those assertions. 
[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E06_ChessWithoutDefCtor.java)

---

### Exercise 7
    Modify Exercise 5 so A and B have
    constructors with arguments instead of default
    constructors. Write a constructor for C and
    perform all initialization within it. 
[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E07_SimpleInheritance2.java)

---

### Exercise 8
    Create a base class with only a non-default
    constructor, and a derived class with both a
    default (no-arg) and non-default constructor.
    Call the base-class constructor in the
    derived-class constructors.
[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E08_CallBaseConstructor.java)

---

### Exercise 9
    Create a class called Root and an instance of
    each of three classes, Component1, Component2, and
    Component3. Derive a class Stem from Root that
    also contains an instance of each "component."
    Default constructors for each class should
    print a message about that class. 
[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E09_ConstructorOrder2.java)

---

### Exercise 10
    Modify Exercise 9 so each class only has
    non-default constructors. 
[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E10_ConstructorOrder3.java)

---

### Exercise 11
    Modify Detergent.java so it uses delegation.    
[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E11_Delegation.java)

---

### Exercise 12
    Add a proper hierarchy of dispose() methods to
    all the classes in Exercise 9;
[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E12_Dispose.java)

---

### Exercise 13
    Create a class with a method that is
    overloaded three times. Inherit a new class,
    add a new overloading of the method, and show
    that all four methods are available in the
    derived class. 
[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E13_InheritedOverloading.java)

---

### Exercise 14
    In Car.java add a service() method to Engine
    and call this method in main(). 
[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E14_ServicableEngine.java)

---

### Exercise 15
    Create a class with a protected method inside
    a package. Try to call the protected method
    outside the package, and explain the results.
    Now inherit from your class and call the
    protected method from inside a method of your
    derived class. 
[Protected class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/protected/E15_Protected.java)

[Test Protected class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E15_TestProtected.java)

---

### Exercise 16
    Create a class called Amphibian. From it,
    inherit a class from it called Frog. Put
    appropriate methods in the base class. In
    main(), create a Frog, upcast it to Amphibian,
    and demonstrate that all the methods still work. 
[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E16_Frog.java)

---

### Exercise 17
    Modify Exercise 16 so Frog overrides the
    method definitions from the base class
    (provides new definitions using the same
    method signatures). Note what happens in
    main(). 
[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E17_Frog2.java)

---

### Exercise 18
    Create a class with a static final field and a
    final field and demonstrate the difference
    between the two.
[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E18_FinalFields.java)

---

### Exercise 19
    Create a class with a blank final reference to
    an object. Perform initialization of the
    blank final inside all constructors.
    Demonstrate that the final must
    be initialized before use, and cannot
    be changed once initialized.
[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E19_BlankFinalField.java)

---

### Exercise 20
    Show that the @Override annotation solves the
    problem from the "final and private" section.

> **Warning** 
> CompileTimeError

[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E20_OverrideAnnotation.java)

---

### Exercise 21
    Create a class with a final method. Inherit
    from that class and attempt to override that
    method. 

> **Warning**
> CompileTimeError

[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E21_FinalMethod.java)

---

### Exercise 22
    Create a final class and attempt to inherit
    from it.
> **Warning**
> CompileTimeError

[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E22_FinalClass.java)

---

### Exercise 23
    Prove that class loading takes place only
    once and may be caused by either the creation
    of the first instance of that class or by
    accessing a static member. 
[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E23_ClassLoading.java)

---

### Exercise 24

	In Beetle.java, inherit a specific type of
	beetle from class Beetle, following the same
	format as the existing classes. Trace and
	explain the output. 
[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/reusing/E24_JapaneseBeetle.java)