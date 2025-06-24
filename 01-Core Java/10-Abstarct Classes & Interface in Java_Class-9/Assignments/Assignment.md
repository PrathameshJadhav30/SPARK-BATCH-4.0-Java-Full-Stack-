# Assignment: Abstract Classes & Interfaces in Java

### Name: Prathamesh Jadhav

### Branch: Artificial Intelligence and Data Science Engineering

---

## 🧠 Part A: Theory Questions with Answers

1. **What is an abstract class in Java? Explain with example.**
   An abstract class in Java is a class that cannot be instantiated and may contain abstract methods (without body) and concrete methods (with implementation). It is declared using the `abstract` keyword.

   ```java
   abstract class Animal {
       abstract void makeSound();
       void sleep() {
           System.out.println("Sleeping...");
       }
   }
   ```

2. **What is an interface? How is it different from an abstract class?**
   An interface is a reference type in Java that contains only abstract methods (Java 7) and constants. It is used to define a contract for implementing classes. Unlike abstract classes, interfaces do not have instance variables or constructors and support multiple inheritance.

3. **List down the key differences between abstract classes and interfaces.**

   * Abstract classes can have both abstract and concrete methods, interfaces can only have abstract methods (Java 7).
   * Abstract classes can have instance variables; interfaces cannot.
   * Abstract classes support single inheritance; interfaces support multiple.
   * Interfaces cannot have constructors.

4. **What do you mean by 100% abstraction? Which keyword achieves it and how?**
   100% abstraction means hiding all implementation details and showing only functionality. Interfaces in Java (prior to Java 8) provide 100% abstraction using the `interface` keyword since they only contain abstract methods.

5. **Why can't we create an object of an abstract class?**
   Abstract classes are incomplete by definition—they may have unimplemented methods. Creating an object without full implementation would lead to undefined behavior, hence Java restricts instantiation.

6. **What is the purpose of abstract methods?**
   Abstract methods provide a template or contract that derived classes must implement. They promote polymorphism and enforce consistent method signatures in subclasses.

7. **Can an abstract class have a constructor? Justify your answer.**
   Yes. Abstract classes can have constructors, which are called when subclasses are instantiated. Constructors are used to initialize common fields.

8. **Explain the use of interfaces in achieving multiple inheritance in Java.**
   Java does not allow multiple inheritance with classes to avoid ambiguity, but it allows a class to implement multiple interfaces, thus achieving multiple inheritance of type.

9. **What modifiers are implicitly applied to interface variables and methods?**

   * Variables: `public static final`
   * Methods (Java 7): `public abstract`

10. **Can an interface extend another interface? Explain with an example.**
    Yes. Interfaces can extend one or more interfaces using the `extends` keyword.

    ```java
    interface A {
        void methodA();
    }

    interface B extends A {
        void methodB();
    }
    ```

---

## 💻 Part B: Programming Tasks

1. Create an abstract class `Vehicle` with abstract method `start()` and concrete method `fuelType()`. Inherit it in class `Bike` and override methods.
2. Define an interface `Flyable` with method `fly()`. Implement it in a class `Bird`.
3. Create two interfaces `A` and `B` with methods `showA()` and `showB()`. Implement both in class `C` and demonstrate multiple inheritance.
4. Write a Java program to demonstrate interface variables (constants) and try to modify them.
5. Create an abstract class `Shape` with method `draw()`. Extend it in class `Circle` and demonstrate runtime polymorphism.
6. Define an interface `ScannerPrinter` that extends another interface `Printable`. Implement it in a class `OfficeDevice`.
7. Create a class with a nested interface `Message` inside a class `Outer`. Implement it in another class and demonstrate nested interface usage.
8. Write a Java program to show the difference between abstract class variables and interface constants.
9. Demonstrate how polymorphism works with both abstract classes and interfaces.
10. Try to create an object of an interface. What error do you get? Write the code and explain the result.
