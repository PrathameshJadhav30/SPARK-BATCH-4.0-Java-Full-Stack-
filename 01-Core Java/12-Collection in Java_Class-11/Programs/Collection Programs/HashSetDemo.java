import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Pen");
        set.add("Pencil");
        set.add("Eraser");
        set.add("Pen"); // Duplicates not allowed

        System.out.println("HashSet: " + set);
        set.remove("Pencil");
        System.out.println("After remove: " + set);
    }
}
