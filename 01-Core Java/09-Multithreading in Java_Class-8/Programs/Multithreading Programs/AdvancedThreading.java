import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class AdvancedThreading {
    static Lock lock = new ReentrantLock();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Callable<String> task = () -> {
            lock.lock();
            try {
             return "Task Completed.....";
            }finally {
                lock.unlock();
            }
        };
        Future<String> result = service.submit(task);
        System.out.println(result.get());
        service.shutdown();
    }
}
