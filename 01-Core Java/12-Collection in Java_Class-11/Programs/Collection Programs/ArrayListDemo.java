import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add(1, "C++");

        System.out.println("ArrayList: " + list);
        list.remove("Python");
        System.out.println("After remove: " + list);
        System.out.println("Get index 0: " + list.get(0));
        System.out.println("Size: " + list.size());
    }
}
