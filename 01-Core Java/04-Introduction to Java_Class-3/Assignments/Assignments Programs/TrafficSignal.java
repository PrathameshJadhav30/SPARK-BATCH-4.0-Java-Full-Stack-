import java.util.Scanner;

public class TrafficSignal {
    public static void main(String[] args) {
        String color = new Scanner(System.in).next().toLowerCase();
        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Get Ready");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid Signal");
        }
    }
}
