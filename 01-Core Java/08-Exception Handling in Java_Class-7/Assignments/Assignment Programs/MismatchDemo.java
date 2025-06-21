public class MismatchDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught ArrayIndexOutOfBoundException");
        }
        //program crashes , because ArithmeticException is not Caught
    }
}
