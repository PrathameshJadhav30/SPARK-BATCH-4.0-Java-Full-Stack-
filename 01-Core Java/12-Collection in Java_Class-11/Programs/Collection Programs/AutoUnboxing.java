public class AutoUnboxing {
    public static void main(String[] args) {
        // Autoboxing
        int a = 50;
        Integer obj = a;

        // Unboxing
        Integer b = 70;
        int c = b;

        System.out.println("Autoboxed Integer: " + obj);
        System.out.println("Unboxed int: " + c);
    }
}
