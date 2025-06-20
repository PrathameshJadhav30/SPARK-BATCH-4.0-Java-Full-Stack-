public class ExceptionMismatch {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught: " + e);
        }
        //No Matching catch block, so exception is unhandeled and program crashes
    }
}
