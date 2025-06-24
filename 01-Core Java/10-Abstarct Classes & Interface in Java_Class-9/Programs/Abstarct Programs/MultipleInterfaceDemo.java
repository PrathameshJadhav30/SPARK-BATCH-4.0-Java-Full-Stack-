interface A {
    void showA();
}

interface B {
    void showB();
}

class c implements A, B {

    @Override
    public void showA() {
        System.out.println("From A");
    }

    @Override
    public void showB() {
        System.out.println("From B");
    }
}

public class MultipleInterfaceDemo {
    public static void main(String[] args) {
        c obj = new c();
        obj.showA();
        obj.showB();
    }
}
