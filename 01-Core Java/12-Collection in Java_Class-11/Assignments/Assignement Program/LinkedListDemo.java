import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.addFirst("C++");
        list.addLast("Python");
        list.add(1,"JavaScript");

        System.out.println("Linked List: " + list);

        list.removeFirst();
        list.removeLast();
        list.remove("Java");

        System.out.println("After Removals: " + list);
        System.out.println("Peek:"+list.peek());
        System.out.println("Poll: " + list.poll());
        System.out.println("Final List: " + list);
    }
}
