import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = str -> str.length();

        System.out.println("Length of Java : " + stringLength.apply("Java"));
        System.out.println("Length of Prathamesh : " + stringLength.apply("Prathamesh"));

    }
}
