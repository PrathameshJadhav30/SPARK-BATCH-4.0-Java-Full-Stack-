public class StringIndexDemo {
    public static void main(String[] args) {
        String str = "Java";
        try{
            System.out.println(str.charAt(10)); //Invalid index
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Caught: " + e);
        }
    }
}
