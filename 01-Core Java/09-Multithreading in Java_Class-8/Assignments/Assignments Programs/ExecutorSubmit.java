import java.util.concurrent.*;

public class ExecutorSubmit {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(() -> System.out.println("Task executed by: " + Thread.currentThread().getName()));
        service.shutdown();
    }
}
