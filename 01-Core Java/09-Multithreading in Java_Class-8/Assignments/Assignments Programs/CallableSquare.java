import java.util.concurrent.*;

public class CallableSquare {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Callable<Integer> task = () -> 5 * 5;
        Future<Integer> future = service.submit(task);
        System.out.println("Square is: " + future.get());
        service.shutdown();
    }
}
