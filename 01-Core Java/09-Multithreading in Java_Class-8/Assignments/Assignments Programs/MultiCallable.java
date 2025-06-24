import java.util.*;
import java.util.concurrent.*;

public class MultiCallable {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Callable<String>> tasks = Arrays.asList(
                () -> "Task 1",
                () -> "Task 2",
                () -> "Task 3"
        );

        List<Future<String>> results = service.invokeAll(tasks);
        for (Future<String> f : results) {
            System.out.println("Result: " + f.get());
        }
        service.shutdown();
    }
}
