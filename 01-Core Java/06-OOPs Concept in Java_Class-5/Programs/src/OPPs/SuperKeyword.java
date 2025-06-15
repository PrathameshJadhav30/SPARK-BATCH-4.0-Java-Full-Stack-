package OPPs;

class Parent {
    int a = 100;

    void display() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    int a = 200;

    void display() {
        super.display(); // calling parent method
        System.out.println("Child method, parent a = " + super.a);
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
