import java.util.*;

public class GenericsDemo {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(100);
        intList.add(200);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("A");
        stringSet.add("B");

        Map<String, Double> map = new HashMap<>();
        map.put("Math", 95.5);
        map.put("Science", 90.0);

        System.out.println("Integer List: " + intList);
        System.out.println("String Set: " + stringSet);
        System.out.println("Subject Scores Map: " + map);
    }
}
