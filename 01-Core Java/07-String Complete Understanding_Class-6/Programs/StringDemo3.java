public class StringDemo3 {
    //How to Create String Object-  Using new Keyword
    public static void main(String[] args) {
        String s1 = new String("Prathamesh");
        String s2 = new String("Prathamesh");
        System.out.println(s1 == s2); //false(Different Objects in heap)
        System.out.println(s1.equals(s2)); //true (Compare Value)
    }
}
