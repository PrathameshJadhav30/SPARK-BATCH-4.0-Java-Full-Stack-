import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println("Is 4 Even: " + isEven.test(4)); //true
        System.out.println("Is 7 Even: " + isEven.test(7)); //fasle
    }
}
