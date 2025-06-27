import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<Integer, Integer> multiply = x -> x * 2;
        Function<Integer, Integer> add = x -> x + 3;

        // andThen: multiply first, then add
        System.out.println("andThen result: " + multiply.andThen(add).apply(5)); // (5*2)+3 = 13

        // compose: add first, then multiply
        System.out.println("compose result: " + multiply.compose(add).apply(5)); // (5+3)*2 = 16
    }
}
