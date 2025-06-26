import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Prathamesh");
        map.put(102, "Sanika");
        map.put(103, "Siddie");

        System.out.println("Student Map: " + map);
    }
}
