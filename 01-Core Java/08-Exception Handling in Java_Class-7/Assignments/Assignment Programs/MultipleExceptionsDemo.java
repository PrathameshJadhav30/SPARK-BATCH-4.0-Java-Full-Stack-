public class MultipleExceptionsDemo {
    public static void main(String[] args) {
        try{
            int a = 5 / 0; //ArithmenticException
            int[] arr = new int[3];
            System.out.println(arr[5]);  //ArrayIndexOutOfBoundsException
            String str = null;
            System.out.println(str.length()); //NullPointerException
        }catch(ArithmeticException e){
            System.out.println("Caught ArithmeticException: "+ e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught ArrayIndexOutOfBoundsException: "+ e);
        }catch(NullPointerException e){
            System.out.println("Caught NullPointerException: "+ e);
        }
    }
}
