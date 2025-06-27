@FunctionalInterface
interface Greetable {
    void greet();
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Greetable g = () -> System.out.println("Hello From Functional Interface");
        g.greet();
    }
}
