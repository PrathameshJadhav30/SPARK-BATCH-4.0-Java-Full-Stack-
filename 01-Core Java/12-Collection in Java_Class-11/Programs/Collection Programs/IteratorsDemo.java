import java.util.*;

public class IteratorsDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("One");
        vector.add("Two");
        vector.add("Three");

        // Enumeration (Only for legacy classes like Vector)
        Enumeration<String> e = vector.elements();
        System.out.println("Enumeration:");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        // Iterator
        ArrayList<String> list = new ArrayList<>(vector);
        Iterator<String> itr = list.iterator();
        System.out.println("Iterator:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // ListIterator
        ListIterator<String> litr = list.listIterator();
        System.out.println("ListIterator (forward):");
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

        System.out.println("ListIterator (backward):");
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }
}
