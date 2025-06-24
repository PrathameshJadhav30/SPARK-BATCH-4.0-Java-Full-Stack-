import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            int taskNum = i;
            pool.execute(() -> System.out.println("Task " + taskNum + " by " + Thread.currentThread().getName()));
        }
        pool.shutdown();
    }
}
