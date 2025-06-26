import java.util.ArrayList;

public class StudentArrayList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Prathamesh");
        students.add("Dev");
        students.add("Vinayak");
        students.add("Rutu");

        System.out.println("Students Names: ");
        for(String name : students){
            System.out.println(name);
        }
    }
}
