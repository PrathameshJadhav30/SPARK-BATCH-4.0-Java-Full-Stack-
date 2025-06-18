public class StringBuilderDemo {
    //StringBuilder (Mutable & Faster, Not Thread Safe)
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Prathamesh");
        sb.append(" Jadhav");
        System.out.println(sb); //"Prathamesh Jadhav"
    }
}
