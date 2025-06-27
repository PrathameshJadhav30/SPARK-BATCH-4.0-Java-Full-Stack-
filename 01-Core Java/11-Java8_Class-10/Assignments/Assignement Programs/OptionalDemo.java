import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String value = null;

        Optional<String> optionalValue = Optional.ofNullable(value);

        optionalValue.ifPresentOrElse(
                val -> System.out.println("Value is: " + val),
                () -> System.out.println("Value is null")
        );
    }
}
