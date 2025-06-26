import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1, "Alpha");
        table.put(2, "Beta");
        table.put(3, "Gamma");

        System.out.println("Hashtable: " + table);
    }
}
