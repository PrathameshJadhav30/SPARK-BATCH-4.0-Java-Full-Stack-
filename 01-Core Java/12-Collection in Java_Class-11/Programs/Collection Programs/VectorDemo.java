import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();
        vec.add(10);
        vec.add(20);
        vec.addElement(30);

        System.out.println("Vector: " + vec);
        vec.remove(1);
        System.out.println("After remove: " + vec);
        System.out.println("Element at index 1: " + vec.get(1));
    }
}
