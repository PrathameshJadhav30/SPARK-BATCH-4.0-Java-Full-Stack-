class Outer {
    interface  Message {
        void greet();
    }
}

class Hello implements Outer.Message {

    @Override
    public void greet() {
        System.out.println("Hello from Nested Interface....");
    }
}
public class NestedInterfaceDemo {
    public static void main(String[] args) {
        Outer.Message obj = new Hello();
        obj.greet();
    }
}
