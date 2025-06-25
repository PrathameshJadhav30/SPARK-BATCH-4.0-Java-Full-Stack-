public class WhyWrapper {
    public static void main(String[] args) {
        Integer a = 20;
        // Wrapper classes allow null values (primitive types don't)
        Integer b = null;

        // Useful in collections (which don’t support primitive types)
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(a);
        list.add(30);
        System.out.println("ArrayList of Integers: " + list);
    }
}
