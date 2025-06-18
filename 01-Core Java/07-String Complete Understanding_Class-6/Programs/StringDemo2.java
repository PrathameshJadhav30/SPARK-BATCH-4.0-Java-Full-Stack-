public class StringDemo2 {
    //How to Create String Object- Using String Literals
    public static void main(String[] args) {
        String s1 = "Prathamesh";
        String s2 = "Prathamesh";  // Points to same object in string Constant Pool
        System.out.println(s1 == s2); //true
    }
}
