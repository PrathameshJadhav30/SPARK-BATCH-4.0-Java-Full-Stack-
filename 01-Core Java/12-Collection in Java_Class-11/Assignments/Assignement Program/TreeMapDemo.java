import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();

        scores.put(50, "Average");
        scores.put(90, "Excellent");
        scores.put(70, "Good");

        System.out.println("Sorted Scores: " + scores);
    }
}
