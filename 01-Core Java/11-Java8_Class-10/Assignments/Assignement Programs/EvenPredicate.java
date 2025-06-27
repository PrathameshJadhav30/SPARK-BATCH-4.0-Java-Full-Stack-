import java.util.function.Predicate;

public class EvenPredicate {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 4 Even: " + isEven.test(4));
    }
}
