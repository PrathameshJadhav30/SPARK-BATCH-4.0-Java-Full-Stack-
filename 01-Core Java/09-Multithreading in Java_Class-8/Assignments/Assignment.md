# 🧵 Java Multithreading - Assignment

👨‍🎓 Name: Prathamesh Jadhav  
🎓 Branch: Artificial Intelligence and Data Science Engineering  
📚 Topic: Java Multithreading Core & Advanced Concepts

---

## ✅ Theory Questions with Answers

### Q1. What is Multithreading in Java? What are its advantages?
**Answer:**  
Multithreading is a programming concept where multiple threads execute independently but share the same process memory. Java supports multithreading using the `Thread` class or `Runnable` interface.  
**Advantages:**
- Efficient CPU utilization
- Simultaneous task execution
- Enhanced application responsiveness
- Reduced execution time for concurrent tasks

---

### Q2. Difference between extending Thread and implementing Runnable?
**Answer:**
| Extending Thread | Implementing Runnable |
|------------------|------------------------|
| Inherits Thread class | Implements Runnable interface |
| Can’t extend other classes | Can extend another class |
| Slightly more overhead | More memory-efficient |

---

### Q3. What is the Thread Scheduler in Java?
**Answer:**  
The thread scheduler is part of the JVM that decides which thread should run at a given time. It uses strategies like preemptive or time-sliced scheduling. Its behavior is platform-dependent.

---

### Q4. Difference between `start()` and `run()` methods?
**Answer:**
- `start()` creates a new thread and then calls `run()`.
- `run()` is just a method call and runs on the current thread without creating a new thread.

---

### Q5. What is the Main Thread?
**Answer:**  
The main thread is the first thread started by the JVM when a Java application runs. It can create and manage additional threads.

---

### Q6. Explain the Thread Lifecycle in Java.
**Answer:**  
Thread lifecycle stages:
1. **New** – Thread object created.
2. **Runnable** – Thread eligible to run.
3. **Running** – Thread is executing.
4. **Blocked/Waiting** – Waiting for resource or signal.
5. **Terminated/Dead** – Execution finished.

---

### Q7. What is Thread Priority?
**Answer:**  
Thread priority is a number (1–10) assigned to threads indicating their importance. Higher-priority threads are generally executed first. Use `setPriority()` and `getPriority()`.

---

### Q8. Difference between `sleep()`, `yield()`, and `join()`?
**Answer:**
- `sleep(ms)` – Pauses thread for specified time.
- `yield()` – Suggests scheduler to switch to another thread.
- `join()` – Waits for another thread to complete.

---

### Q9. What is Synchronization and why is it needed?
**Answer:**  
Synchronization ensures that only one thread accesses shared resources at a time. It prevents race conditions and data inconsistency.

---

### Q10. Which is better: synchronized method or block?
**Answer:**  
Synchronized blocks are better practice because they offer more granular locking—only the critical section is locked, reducing performance bottlenecks.

---

### Q11. Explain `wait()`, `notify()`, and `notifyAll()` methods.
**Answer:**  
- `wait()` – Thread waits and releases lock.
- `notify()` – Wakes one waiting thread.
- `notifyAll()` – Wakes all waiting threads.
All must be called inside synchronized context.

---

### Q12. Difference between `synchronized` and `Lock`?
**Answer:**

| synchronized | Lock (e.g., ReentrantLock) |
|--------------|-----------------------------|
| Intrinsic locking mechanism | Explicit locking |
| Cannot try lock or interrupt lock | Supports tryLock(), lockInterruptibly() |
| Automatically releases lock | Requires manual unlock |

---

### Q13. What are ExecutorService and its methods?
**Answer:**  
`ExecutorService` manages thread pools in Java. Key methods:
- `execute(Runnable task)`
- `submit(Callable<T>)`
- `shutdown()`, `shutdownNow()`

---

### Q14. Difference between Callable and Runnable?
**Answer:**

| Runnable | Callable |
|----------|----------|
| Doesn’t return result | Returns result using `Future` |
| No checked exception | Can throw checked exception |
| `run()` method | `call()` method |

---

## 💻 Programming Questions 

### Creating Threads
- Q15. Write a Java program to create a thread by extending `Thread` class.
- Q16. Write a Java program to create a thread by implementing `Runnable` interface.

---

### Thread Scheduler
- Q17. Create two threads and observe thread execution order.
- Q18. Try assigning priorities to threads and observe the scheduler behavior.

---

### start() vs run()
- Q19. Create a thread and invoke both `run()` and `start()` to see the difference.

---

### Main Thread
- Q20. Print the current thread name and set a custom name to the main thread.

---

### Thread Lifecycle
- Q21. Demonstrate the states: NEW, RUNNABLE, WAITING, TERMINATED using print statements.

---

### Thread Methods
- Q22. Use `sleep()`, `join()`, and `isAlive()` in a thread example.

---

### Thread Priority
- Q23. Create 3 threads with different priorities and analyze output order.

---

### Prevent Thread Execution
- Q24. Write a program that uses `sleep()` and `join()` for thread control.

---

### Synchronization
- Q25. Create a program showing inconsistent output when accessing shared data.
- Q26. Use `synchronized` keyword to fix it.

---

### Synchronization Block vs Method
- Q27. Use synchronized method for thread-safe access.
- Q28. Modify the program to use synchronized block and compare.

---

### Inter Thread Communication
- Q29. Implement producer-consumer problem using `wait()` and `notify()`.
- Q30. What error occurs if `wait()` is called outside synchronized block?

---

### Lock, ReentrantLock, Callable, Executor
- Q31. Use `ReentrantLock` in a program to protect shared data.
- Q32. Use `ExecutorService` to run multiple threads using `submit()` method.
- Q33. Use `Callable` and `Future` to compute and return the square of a number.

---

### Lock vs Synchronized
- Q34. Rewrite any synchronized block example using `ReentrantLock`.

---

### ExecutorService – Pool
- Q35. Create a thread pool of 3 threads to execute 5 tasks using `ExecutorService`.
- Q36. Demonstrate shutdown and awaitTermination methods.

---

### Future vs Callable
- Q37. Submit a task using Callable that returns a string result.
- Q38. Submit multiple callables and retrieve results using `Future.get()`.

---

