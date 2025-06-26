@FunctionalInterface
interface Sayable {
    void say();
    //only one abstarct method allowed in functional Interface
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Sayable s = () -> System.out.println("Hello From Functional Interface...");
        s.say();
    }
}
