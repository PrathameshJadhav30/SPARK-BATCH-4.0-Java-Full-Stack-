abstract class Animal {
    abstract void makeSound();
}

interface Pet {
    void play();
}

class Dog extends Animal implements Pet {
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void play() {
        System.out.println("Dog plays fetch");
    }
}

public class TestPolyBoth {
    public static void main(String[] args) {
        Animal a = new Dog(); // Polymorphism via abstract class
        a.makeSound();

        Pet p = new Dog(); // Polymorphism via interface
        p.play();
    }
}
