import java.util.*;

public class CollectionVsCollections {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        System.out.println("Collection: " + list);

        // Collections is a utility class
        Collections.sort((List<String>) list);
        System.out.println("Sorted Collection: " + list);
    }
}
