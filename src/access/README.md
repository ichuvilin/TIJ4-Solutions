# Chapter 6 Quest Navigation

### Exercise 1

    Create a class in a package. Create an instance of your class outside of that package.

[Packaged Class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/access/local/E01_PackagedClass.java)

[Foreign Class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/access/E01_ForeignClass.java)

---

### Exercise 2

    Turn the code fragments in the "Collisions" section into a program, and verify that collisions do in fact occur.

[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/access/E02_TestCollisions.java)

---

### Exercise 3

    Create two packages: debug and debugoff, containing an identical class with a debug() method. The first version displays its String argument to the console, the second does nothing. Import the class into a test program using a static import line, and demonstrate the conditional compilation effect.

[Debug in debug package](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/access/debug/E03_Debug.java)

[Debug in debugoff package](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/access/debugoff/E03_Debug.java)

[Debug App](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/access/E03_DebugApp.java)

[Release App](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/access/E03_ReleaseApp.java)

---

### Exercise 4

    Show that protected methods have package access but are not public. 

[Packaged Class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/access/local/E04_PackagedClass.java)

[Consumer in same Package](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/access/local/E04_ConsumerInSamePackage.java)

[Foreign Class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/access/E04_ForeignClass.java)

---

### Exercise 5

    Create a class with public, private, protected, and package-access fields and method members. Create an object of this class and see what kind of compiler messages you get when you try to access all the class members. Remember that classes in the same directory are part of the "default" package. 

[Access Control class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/access/local/E05_AccessControl.java)

[Other class in local package](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/access/local/E05_Other.java)

[Final Other class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/access/E05_Other.java)

---

### Exercise 6
    Create one class with protected data, and a second class in the same file with a method that manipulates that protected data.

[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/access/E06_ProtectedManipulation.java)

---

### Exercise 7

    Create the library according to the code fragments describing access and Widget. Create a Widget in a class that is not part of the access package. 

[Widget class creator](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/access/e07/E07_Widget.java)

[Widget class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/access/Widget.java)

---

### Exercise 8

Following the form of the example Lunch.java, create a class called ConnectionManager that manages a fixed array of Connection objects. The client programmer must not be able to create Connection objects, but only get them via a static method in ConnectionManager. ConnectionManager returns a null reference when it runs out of objects. Test the classes in main()

[Connection class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/access/connection/Connection.java)

[ConnectionManager class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/access/connection/ConnectionManager.java)

[Main class](https://github.com/ichuvilin/TIJ4-Solutions/blob/master/src/access/E08_ConnectionManager.java)
