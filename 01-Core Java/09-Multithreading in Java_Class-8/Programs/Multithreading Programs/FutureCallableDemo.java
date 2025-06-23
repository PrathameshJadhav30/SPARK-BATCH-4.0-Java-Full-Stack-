import java.util.concurrent.*;

public class FutureCallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callTask = () -> "Callable Completed";
        ExecutorService ex = Executors.newSingleThreadExecutor();
        Future<String> future = ex.submit(callTask);
        System.out.println("Result: " + future.get());  //Blocking call
        ex.shutdown();
    }
}
