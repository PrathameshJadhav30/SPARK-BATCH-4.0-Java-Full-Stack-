import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> tasks = new PriorityQueue<>();

        tasks.add("Low Priority Task");
        tasks.add("High Priority task");
        tasks.add("Medium Priority Task");

        while (!tasks.isEmpty()){
            System.out.println("Processing: " + tasks.poll());
        }
    }
}
