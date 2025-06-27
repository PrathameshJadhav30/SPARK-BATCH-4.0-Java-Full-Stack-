import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Prathamesh", "Ravi", "Ankit", "Raj");

        // Collect to List
        List<String> filtered = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Names starting with A: " + filtered);

        // Join with comma
        String joined = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println("All names: " + joined);
    }
}
