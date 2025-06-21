import java.io.*;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Pratham.txt");
        }catch (FileNotFoundException e){
            System.out.println("File not found: " + e);
        }finally {
            System.out.println("Cleaning resources....");
        }
    }
}
