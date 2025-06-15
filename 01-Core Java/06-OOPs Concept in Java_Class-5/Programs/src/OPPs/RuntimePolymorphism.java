package OPPs;


class Animal4 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cow extends Animal4 {
    void sound() {
        System.out.println("Cow moos");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal4 a = new Cow(); // Upcasting
        a.sound(); // Runtime method binding
    }
}
