class Shape {
    Shape(){
        System.out.println("Shape Constructor");
    }

    void draw(){
        System.out.println("Drawing shape");
    }
}

class Rectangle extends Shape{
    Rectangle(){
        super(); // calls Shape's draw()
        System.out.println("Drawing rectangle");
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.draw();
    }
}
