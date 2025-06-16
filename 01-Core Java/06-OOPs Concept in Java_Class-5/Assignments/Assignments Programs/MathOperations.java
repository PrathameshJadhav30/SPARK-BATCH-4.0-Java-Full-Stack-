public class MathOperations {
    void multiply(int a, int b){
        System.out.println("int multiply: " + (a * b));
    }
    void multiply(double a, double b){
        System.out.println("double multiply: " + (a * b));
    }
    void multiply(int a, int b, int c){
        System.out.println("3-int multiply: "+ (a * b * c));
    }

    public static void main(String[] args) {
        MathOperations mo = new MathOperations();
        mo.multiply(3,4);
        mo.multiply(2.5, 6.5);
        mo.multiply(4,6,8);
    }
}
