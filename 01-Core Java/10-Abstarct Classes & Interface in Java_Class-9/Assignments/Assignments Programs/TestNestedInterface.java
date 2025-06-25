class Outer {
    interface message {
        void showMessage();
    }
}

class Hello implements  Outer.message {

    @Override
    public void showMessage() {
        System.out.println("Hello from nested interface");
    }
}

public class TestNestedInterface {
    public static void main(String[] args) {
      Outer.message msg = new Hello();
      msg.showMessage();
    }
}
