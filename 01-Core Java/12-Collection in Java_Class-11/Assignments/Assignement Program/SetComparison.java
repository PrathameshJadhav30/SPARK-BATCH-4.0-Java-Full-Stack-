import java.util.*;

public class SetComparison {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        String[] items = {"Banana", "Apple", "Orange", "Banana"};

        for (String item : items) {
            hashSet.add(item);
            linkedHashSet.add(item);
            treeSet.add(item);
        }

        System.out.println("HashSet (Unordered): " + hashSet);
        System.out.println("LinkedHashSet (Ordered): " + linkedHashSet);
        System.out.println("TreeSet (Sorted): " + treeSet);
    }
}
