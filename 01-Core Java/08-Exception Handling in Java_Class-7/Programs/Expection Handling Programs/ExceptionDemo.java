public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Start of Program");

        int a = 10, b = 0;
        int result = a / b;  //This will cause ArithmeticException

        System.out.println("End of Program");
    }
}
