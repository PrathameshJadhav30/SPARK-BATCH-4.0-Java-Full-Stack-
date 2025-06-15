package OPPs;

abstract class Shape {
    abstract void draw(); // abstract method
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle...");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
