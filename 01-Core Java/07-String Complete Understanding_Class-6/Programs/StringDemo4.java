public class StringDemo4 {
    //Heap Object vs String Constant Pool
    public static void main(String[] args) {
        String literal = "Java";  //stored in SCP (String Constant Pool)
        String object = new String("Java"); //Stored in heap

        System.out.println("== Comparison: "+ (literal == object));  //false
        System.out.println(".equals Comparison: " + literal.equals(object));  //true
    }
}
