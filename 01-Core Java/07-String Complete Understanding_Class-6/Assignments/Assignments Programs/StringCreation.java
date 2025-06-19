public class StringCreation {
    public static void main(String[] args) {
        String s1 = "Java"; //Literal
        String s2 = "Java"; //Same reference from Pool
        String s3 = new String("Java"); //new object in heap

        System.out.println(s1 == s2); //true (same reference)
        System.out.println(s1 == s3); //false (different reference)
        System.out.println(s1.equals(s3));  //true (same content)
    }
}
