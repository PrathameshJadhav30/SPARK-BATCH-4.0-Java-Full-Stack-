import com.sun.security.jgss.GSSUtil;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();

        names.add("Prathamesh");
        names.add("Sanika");
        names.add("Siddie");

        System.out.println("Sorted Names : " + names);
    }
}
