public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }

        try {
            int[] arr = new int[3];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception: " + e);
        }

        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e);
        }
    }
}
