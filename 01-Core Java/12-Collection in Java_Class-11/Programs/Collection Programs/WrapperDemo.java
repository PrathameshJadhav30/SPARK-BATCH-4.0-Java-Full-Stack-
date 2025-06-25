public class WrapperDemo {
    public static void main(String[] args) {
        int a = 10;
        Integer wrapperA = Integer.valueOf(a); // Manual boxing
        System.out.println("Primitive int: " + a);
        System.out.println("Wrapper Integer: " + wrapperA);
    }
}
