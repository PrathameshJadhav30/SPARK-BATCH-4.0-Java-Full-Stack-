# ✅ Java 8 Assignment  
**Name**: Prathamesh Jadhav  
**Branch**: Artificial Intelligence and Data Science Engineering  

---

## 📘 Theory Questions with Answers

### 1. What is Lambda Expression in Java 8?
Lambda Expression is an anonymous function used to implement a method defined by a functional interface. It provides a clear and concise way to represent a single method interface using an expression.

**Syntax:**
```java
(parameter) -> { body }
```
### 2. What is a Functional Interface?
A functional interface in Java is an interface that contains only one abstract method. It can have multiple default or static methods.

**Example:**
```java

@FunctionalInterface
interface MyFunc {
    void show();
}
```
### 3. What is the use of Default Methods in Interfaces?
Default methods allow interfaces to have method implementations. This helps in extending interfaces without affecting existing implementations.

### 4. What is the java.util.function package?
It contains built-in functional interfaces like:

- Predicate<T>

- Function<T, R>

- Consumer<T>

- Supplier<T>

These are used to implement functional programming constructs in Java 8.

### 5. What is Stream API in Java 8?
Stream API is used to process collections of objects in a functional style. It allows operations like:

- filter()

- map()

- reduce()

- collect()

- forEach()

It is useful for writing concise and readable code using pipelines.

## 💻 Programming Questions
1. Write a Java program using a Lambda Expression to print a message.
2. Create a Functional Interface and implement it using a lambda expression.
3. Create an interface with a default method. Implement it in a class and call both methods.
4. Use a Predicate to check if a number is even.
5. Use a Function to find the square of a number.
6. Create a list of strings and use Stream API to:
Filter names starting with “A”

    - Convert them to uppercase

     - Print them using forEach()

7. Demonstrate the use of map() and filter() using Stream API.
8. Write a program using Stream API to count the number of strings in a list that start with "J".
9. Demonstrate chaining of Function using andThen() and compose().
10. Write a Java program to use Consumer interface to print each element of a list.

## ✅ Bonus (Advanced)
11. What is the difference between map() and flatMap() in Stream API?
12. Write a program using Optional to avoid NullPointerException.
13. Show method reference usage with System.out::println.
14. Use Collectors.toList() and Collectors.joining() in a Stream pipeline.
