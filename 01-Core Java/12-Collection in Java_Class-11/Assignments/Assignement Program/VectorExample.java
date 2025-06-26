import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> tasks = new Vector<>();
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");
        tasks.add("Task 4");

        synchronized (tasks){
            for(String task : tasks){
                System.out.println("Processing: " + task);
            }
        }
    }
}
