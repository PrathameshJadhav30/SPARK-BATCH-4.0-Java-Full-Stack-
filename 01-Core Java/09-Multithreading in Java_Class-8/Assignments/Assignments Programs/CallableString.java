import java.util.concurrent.*;

public class CallableString {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Callable<String> task = () -> "Hello from Callable!";
        Future<String> result = service.submit(task);
        System.out.println("Result: " + result.get());
        service.shutdown();
    }
}
