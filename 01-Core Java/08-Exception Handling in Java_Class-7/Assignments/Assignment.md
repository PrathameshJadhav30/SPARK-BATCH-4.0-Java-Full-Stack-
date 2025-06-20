# Java Exception Handling – Assignment
**Name**: Prathamesh Jadhav  
**Branch**: Artificial Intelligence and Data Science Engineering

---

## 📘 Part A: Theory-Based Understanding with Answers

---

### 1. What is an Exception? How does Java handle exceptions internally?

**Answer:**  
An exception is an unwanted or unexpected event that disrupts the normal flow of a program during execution. Java handles exceptions using an object-oriented approach by encapsulating errors into objects. These objects are derived from the `Throwable` class. Java uses five main keywords for exception handling: `try`, `catch`, `finally`, `throw`, and `throws`. Internally, when an exception occurs, the Java Virtual Machine (JVM) creates an exception object and looks for a matching `catch` block using a mechanism called the **exception propagation stack**.

---

### 2. Differentiate between Checked and Unchecked Exceptions with examples.

**Answer:**  
| Feature              | Checked Exception                   | Unchecked Exception                 |
|----------------------|--------------------------------------|--------------------------------------|
| Compile-time Check   | Yes                                  | No                                   |
| Inherits from        | `Exception`                         | `RuntimeException`                   |
| Handling Required    | Must be handled or declared          | Optional to handle                   |
| Examples             | `IOException`, `SQLException`       | `NullPointerException`, `ArithmeticException` |

---

### 3. Explain the purpose of `try`, `catch`, `finally`, `throw`, and `throws` keywords.

**Answer:**

- **try**: Defines a block of code to be tested for errors.
- **catch**: Defines a block of code to handle the error.
- **finally**: Always executes after the try-catch blocks, used for cleanup.
- **throw**: Used to explicitly throw an exception.
- **throws**: Declares exceptions that a method can throw to the calling method.

---

### 4. What is Exception Mismatch? Give a real-time scenario example.

**Answer:**  
Exception mismatch occurs when the `catch` block does not match the type of exception thrown in the `try` block. This leads to the exception not being handled and the program crashing.

**Example:**  
```java
try {
   int a = 5 / 0;
} catch (ArrayIndexOutOfBoundsException e) {
   System.out.println("Handled");
}
```
**Output:**

Exception in thread "main" java.lang.ArithmeticException: / by zero

### 5. What is the difference between throw and throws in Java?
**Answer:**

- throw is used to explicitly throw an exception from a method or block of code.

**Example:** throw new ArithmeticException("Not valid");

- throws is used in method signatures to declare exceptions that might be thrown.

**Example:** void readFile() throws IOException { ... }

---

## 💻 Part B: Practical Programs

### 🔹 1. Basic Exception Handling
- Write a program to divide two numbers. Handle the case where the denominator is zero using try-catch.

### 🔹 2. Multiple Exception Messages
- Write a program that causes and handles the following exceptions:
  - ArithmeticException
  - ArrayIndexOutOfBoundsException
  - NullPointerException

### 🔹 3. Checked Exception – Fully Checked
- Use `FileReader` to read a file that does not exist and handle the `FileNotFoundException`.

### 🔹 4. Checked Exception – Partially Checked
- Simulate and handle a `SQLException` manually using `throw new SQLException(...)`.

### 🔹 5. Unchecked Exception Demo
- Write a program to demonstrate `StringIndexOutOfBoundsException`.

### 🔹 6. Stack Trace Output
- Write a program that throws an exception and prints the complete stack trace using `e.printStackTrace()`.

### 🔹 7. Try-Catch-Finally
- Write a program to open a file (fake filename), catch the exception, and always execute `finally` block to display “Cleaning resources…”.

### 🔹 8. Exception Mismatch
- Write a program that throws an `ArithmeticException` but you write only a `catch(ArrayIndexOutOfBoundsException)` block. Observe the result.

### 🔹 9. Using `throws` Keyword
- Write a program with a method that declares `throws IOException`, and handle it in the `main` method.

### 🔹 10. Using `throw` Keyword
- Write a method that checks age and throws `ArithmeticException` if the age is less than 18. Call it in `main` and handle the exception.

---

## 💡 Bonus Questions

1. Create a custom exception called `InvalidMarksException`. Throw this exception if marks are not between 0 and 100.
2. Demonstrate exception propagation across multiple methods using `throws`.
3. Create a method `divide(int a, int b)` that throws an exception if `b == 0`. Handle it properly from the main method.

---

Happy Coding! ☕
