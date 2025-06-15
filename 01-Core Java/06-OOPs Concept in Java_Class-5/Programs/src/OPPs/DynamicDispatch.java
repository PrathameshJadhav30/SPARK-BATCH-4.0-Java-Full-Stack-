package OPPs;

class Shape1 {
    void draw() {
        System.out.println("Drawing shape...");
    }
}

class Square extends Shape1 {
    void draw() {
        System.out.println("Drawing square...");
    }
}
public class DynamicDispatch {
    public static void main(String[] args) {
        Shape1 s; // reference of parent
        s = new Square(); // object of child
        s.draw(); // call resolved at runtime
    }
}
