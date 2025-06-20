import java.io.*;

public class ThrowsKeywordDemo {
    static void readFile() throws IOException {
        FileReader fr = new FileReader("file.txt");
    }
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Exception handled in main: " + e);
        }
    }
}
