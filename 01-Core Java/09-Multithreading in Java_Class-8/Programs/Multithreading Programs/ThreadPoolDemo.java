import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);

        Runnable task = () -> System.out.println("Task Executed: " + Thread.currentThread().getName());
        pool.execute(task);
        pool.execute(task);
        pool.shutdown();
    }
}
