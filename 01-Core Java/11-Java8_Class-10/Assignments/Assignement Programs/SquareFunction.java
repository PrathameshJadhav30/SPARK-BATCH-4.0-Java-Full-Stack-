import java.util.function.Function;

public class SquareFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> square = n -> n * n;
        System.out.println("Square of 5: " + square.apply(5));
    }
}
