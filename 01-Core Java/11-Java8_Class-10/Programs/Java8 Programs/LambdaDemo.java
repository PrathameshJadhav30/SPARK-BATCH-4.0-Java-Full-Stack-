interface  Drawable {
    void draw();
}

public class LambdaDemo {
    public static void main(String[] args) {
        //Lambda expression to implement draw()
        Drawable d = () -> System.out.println("Drawing using Lambda Expression..");
        d.draw();
    }
}
