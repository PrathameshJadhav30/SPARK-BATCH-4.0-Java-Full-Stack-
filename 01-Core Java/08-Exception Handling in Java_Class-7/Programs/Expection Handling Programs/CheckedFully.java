import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedFully {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Prathamesh.txt");
        } catch(FileNotFoundException e) {
            System.out.println("File not found " + e);
        }
    }
}
