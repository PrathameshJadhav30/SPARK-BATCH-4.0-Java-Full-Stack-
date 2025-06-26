import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Prathamesh","Siddie", "Sanika","Vijay", "Shiv");

        //stream with filter, map and forEach
        names.stream()
                .filter(name -> name.startsWith("P"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
