import java.util.Arrays;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        Arrays.asList("One", "Two", "Three")
                .forEach(System.out::println); // method reference
    }
}
