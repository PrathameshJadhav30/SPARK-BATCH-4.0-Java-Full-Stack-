public class UsingStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Prathamesh");
        sb.append(" Jadhav");
        sb.insert(5, "Java");
        System.out.println(sb);
    }
}
