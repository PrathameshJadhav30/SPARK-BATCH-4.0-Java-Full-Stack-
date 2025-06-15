package OPPs;

class A {
    void msg() {
        System.out.println("Class A");
    }
}

class B extends A {
    void msg2() {
        System.out.println("Class B");
    }
}

class C extends B {
    void msg3() {
        System.out.println("Class C");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.msg();
        c.msg2();
        c.msg3();
    }
}
