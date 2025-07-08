import java.util.Scanner;

public class LibraryUtils {
    public static Scanner scanner = new Scanner(System.in);

    public static int readInt(String message){
        System.out.println(message);
        return scanner.nextInt();
    }

    public static String readString(String message){
        System.out.println(message);
        return scanner.next();
    }
}
