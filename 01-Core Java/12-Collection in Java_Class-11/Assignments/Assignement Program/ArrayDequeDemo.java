import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        //Queue Behavior
        deque.offer("one");
        deque.offer("Two");
        deque.offer("Three");
        System.out.println("Queue peek: " + deque.peek());

        //Stack Behavior
        deque.push("Zero");
        System.out.println("After Push: " + deque);

        deque.pop();
        System.out.println("After pop: " + deque);
    }
}
