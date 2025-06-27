import java.util.*;
import java.util.stream.*;

public class CountStartingJ {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Prathamesh", "Jack", "Bob", "Raj","John");

        long count = names.stream()
                .filter(name -> name.startsWith("J"))
                .count();

        System.out.println("Count of names starting with j: " + count);
    }
}
