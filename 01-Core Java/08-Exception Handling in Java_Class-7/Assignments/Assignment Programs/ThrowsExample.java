import java.io.*;

public class ThrowsExample {
    public static void readFile() throws IOException {
        throw new IOException("Simulated IoException");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Caught IoException: " + e.getMessage());
        }
    }
}
