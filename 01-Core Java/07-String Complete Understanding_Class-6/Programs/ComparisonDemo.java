public class ComparisonDemo {
    //String Comparison: == vs .equals()
    public static void main(String[] args) {
        String a = "Code";
        String b = "Code";
        String c = new String("Code");

        System.out.println(a == b);      // true
        System.out.println(a == c);      // false
        System.out.println(a.equals(c)); // true
    }
}
