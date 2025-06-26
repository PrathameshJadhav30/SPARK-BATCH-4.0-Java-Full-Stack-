import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> products = new LinkedHashMap<>();

        products.put(1, "Pen");
        products.put(2, "Notebook");
        products.put(3, "Pencil");

        System.out.println("Product Entries: " + products);
    }
}
