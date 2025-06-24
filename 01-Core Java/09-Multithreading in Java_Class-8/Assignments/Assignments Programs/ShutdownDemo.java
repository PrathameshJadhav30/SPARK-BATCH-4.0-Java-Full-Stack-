import java.util.concurrent.*;

public class ShutdownDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.execute(() -> System.out.println("Task running"));
        service.shutdown();

        if (!service.awaitTermination(2, TimeUnit.SECONDS)) {
            System.out.println("Still waiting...");
        } else {
            System.out.println("All tasks completed");
        }
    }
}
