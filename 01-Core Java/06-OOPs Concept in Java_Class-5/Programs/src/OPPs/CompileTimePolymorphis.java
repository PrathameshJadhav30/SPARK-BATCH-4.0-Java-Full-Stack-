package OPPs;

class Calculator1 {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
public class CompileTimePolymorphis {
    public static void main(String[] args) {
        Calculator1 c = new Calculator1();
        System.out.println(c.add(5, 3));
        System.out.println(c.add(2.5, 3.5));
    }
}
