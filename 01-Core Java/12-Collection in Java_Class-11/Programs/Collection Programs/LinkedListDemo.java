import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Dog");
        list.addFirst("Cat");
        list.addLast("Parrot");

        System.out.println("LinkedList: " + list);
        list.removeFirst();
        list.removeLast();
        System.out.println("After removals: " + list);
    }
}
