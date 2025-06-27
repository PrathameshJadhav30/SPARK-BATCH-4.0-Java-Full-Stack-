import java.util.*;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("Apple", "Banana", "Cherry");

        Consumer<String> printer = item -> System.out.println("Item: " + item);
        items.forEach(printer);
    }
}
