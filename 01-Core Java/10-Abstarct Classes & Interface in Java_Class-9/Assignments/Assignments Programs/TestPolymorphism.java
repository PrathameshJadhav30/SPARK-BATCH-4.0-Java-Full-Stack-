abstract class Shape {
    abstract void draw();
}

class circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
       Shape s = new circle();  //Runtime Polymorphism
       s.draw();
    }
}
