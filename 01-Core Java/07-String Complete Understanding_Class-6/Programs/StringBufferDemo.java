public class StringBufferDemo {
    //StringBuffer (Mutable & Thread Safe)
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Prathamesh");
        sb.append(" Jadhav");
        System.out.println(sb);  // "Prathamesh Jadhav"
    }
}
