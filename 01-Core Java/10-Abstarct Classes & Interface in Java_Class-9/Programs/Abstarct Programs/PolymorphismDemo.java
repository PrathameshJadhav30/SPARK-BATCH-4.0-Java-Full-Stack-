abstract class shape {
    abstract void draw();
}

class Circle extends shape {

    @Override
    void draw() {
        System.out.println("Drawing Shape.....");
    }
}

interface Drawable{
    void draw();
}
class Square implements  Drawable{

    @Override
    public void draw() {
        System.out.println("Drawing Square.....");
    }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        shape s = new Circle();   //Abstarct class Polymorphism
        s.draw();

        Drawable d = new Square();  //Interface Polymorphism
        d.draw();
    }
}
