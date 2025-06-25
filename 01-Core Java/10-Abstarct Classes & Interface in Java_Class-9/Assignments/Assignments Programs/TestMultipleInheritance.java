interface A {
    void showA();
}

interface B {
    void showB();
}

class C implements A,B {

    @Override
    public void showA() {
        System.out.println("Method from Interface A");
    }

    @Override
    public void showB() {
        System.out.println("Method from Interface B");
    }
}
public class TestMultipleInheritance {
    public static void main(String[] args) {
       C obj = new C();
       obj.showA();
       obj.showB();
    }
}
