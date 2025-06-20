public class ShowStackTrace {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch(ArithmeticException e){
            e.printStackTrace();  //Shows full exception trace
        }
    }
}
