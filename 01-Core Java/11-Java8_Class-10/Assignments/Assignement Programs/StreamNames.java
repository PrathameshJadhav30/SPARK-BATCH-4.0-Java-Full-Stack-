import java.util.*;
import java.util.stream.*;

public class StreamNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Prathamesh", "Sanika", "Komal","Vaibhav");

        names.stream()
                .filter(name -> name.startsWith("P"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
        
    }
}
