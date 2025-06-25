# Java Collection Framework – Assignment and Theory Notes
**Name**: Prathamesh Jadhav  
**Branch**: Artificial Intelligence and Data Science Engineering  

---

## 📘 Theory Questions and Answers

### 1. What is the Collection Framework in Java and why is it used?
The Java Collection Framework provides a set of interfaces and classes to store and manipulate groups of data as a single unit. It standardizes data structures such as lists, sets, and maps, offering ready-made APIs for sorting, searching, insertion, and deletion.

### 2. Difference between `Collection` and `Collections`
- `Collection` is the root interface in the collection hierarchy.
- `Collections` is a utility class that contains static methods for collection operations like sorting and searching.

### 3. Main Interfaces in Collection Framework
- `List`
- `Set`
- `Queue`
- `Deque`
- `Map` (though not under Collection interface)

### 4. Role of `Iterable`
The `Iterable` interface is the root of the collection hierarchy. It provides the ability to iterate over a collection using an iterator or enhanced for-loop.

### 5. What is the `List` interface?
A `List` is an ordered collection that allows duplicate elements. Elements can be accessed by their index.

### 6. Difference between `ArrayList` and `LinkedList`
- `ArrayList` is backed by a dynamic array, provides fast random access.
- `LinkedList` is backed by a doubly linked list, provides fast insertions/deletions.

### 7. Vector vs Stack
- `Vector` is a synchronized list.
- `Stack` is a subclass of Vector that follows LIFO (Last In First Out).

### 8. Set vs List
- `Set` does not allow duplicate elements, whereas `List` does.
- `Set` is unordered (except for `LinkedHashSet`), `List` maintains order.

### 9. HashSet vs TreeSet vs LinkedHashSet
- `HashSet`: No order, allows null, fast performance.
- `LinkedHashSet`: Maintains insertion order.
- `TreeSet`: Sorted order, does not allow null.

### 10. Queue and Deque
- `Queue` follows FIFO (First In First Out).
- `Deque` allows insertion/removal from both ends.

### 11. Map Interface
- Stores key-value pairs.
- Does not extend `Collection` interface.

### 12. HashMap vs LinkedHashMap vs TreeMap vs Hashtable
- `HashMap`: Unordered, allows one null key and multiple null values.
- `LinkedHashMap`: Maintains insertion order.
- `TreeMap`: Sorted order by keys.
- `Hashtable`: Synchronized version, does not allow null.

---

## 💻 Programming Assignment Questions

### List Interface and Implementations
1. Write a Java program using `ArrayList` to store and retrieve student names.
2. Demonstrate all major methods of `LinkedList` with examples.
3. Create a program using `Vector` to simulate a thread-safe list of tasks.
4. Write a Java program demonstrating `Stack` push and pop operations.

### Set Interface and Implementations
5. Write a program using `HashSet` to store unique city names.
6. Demonstrate how `LinkedHashSet` maintains insertion order.
7. Create a Java program using `TreeSet` to sort and display names.

### Queue Interface and Implementations
8. Write a Java program using `PriorityQueue` for task scheduling.
9. Demonstrate a program using `ArrayDeque` for stack and queue operations.

### Map Interface and Implementations
10. Write a program using `HashMap` to store roll numbers and student names.
11. Write a program using `LinkedHashMap` to maintain order of product entries.
12. Display key-value pairs in sorted order using `TreeMap`.
13. Create a `Hashtable` and demonstrate its synchronization behavior.

### Concept-Based
14. Compare `HashSet`, `LinkedHashSet`, and `TreeSet` with examples.
15. Demonstrate the use of Generics with different collections.

---
