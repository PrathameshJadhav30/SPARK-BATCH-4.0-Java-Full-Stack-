package OPPs;

class Animal1 {
void eat() {
    System.out.println("Eating...");
}
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Barking...");
    }
}
public class InheritanceSingle {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.eat();
        d.bark();
    }
}
