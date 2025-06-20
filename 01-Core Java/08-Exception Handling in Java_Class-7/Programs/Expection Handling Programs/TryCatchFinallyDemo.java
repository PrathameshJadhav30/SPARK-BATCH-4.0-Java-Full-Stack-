public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch(ArithmeticException e){
            System.out.println("Caught Exception: " + e);
        } finally {
            System.out.println("Finally Block always run");
        }
    }
}
