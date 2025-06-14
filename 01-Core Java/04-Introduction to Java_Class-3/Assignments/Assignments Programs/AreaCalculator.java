import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Circle
        System.out.println("Enter Radius: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle: " + (Math.PI*r*r));

        //Rectangle
        System.out.println("Enter Length And Breadth: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle: " + (l * b));

        //Triangle
        System.out.println("Enter Base and Height: ");
        double base = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Area of Triangle: " + (0.5 * base * h));
    }
}
