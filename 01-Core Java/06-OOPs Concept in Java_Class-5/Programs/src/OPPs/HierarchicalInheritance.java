package OPPs;

class Animal2 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Cat1 extends Animal2 {
    void meow() {
        System.out.println("Cat meows");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("Dog barks");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cat1 c = new Cat1();
        Dog2 d = new Dog2();
        c.sound();
        c.meow();
        d.sound();
        d.bark();
    }
}
