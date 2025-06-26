import java.util.HashSet;

public class CityHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Salgare");
        cities.add("Sangli");
        cities.add("Ashta");
        cities.add("Belanki");
        cities.add("Salgare");  //Duplicate

        System.out.println("Unique Cities: " + cities);
    }
}
