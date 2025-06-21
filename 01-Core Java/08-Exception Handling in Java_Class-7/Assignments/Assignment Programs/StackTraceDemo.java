public class StackTraceDemo {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
