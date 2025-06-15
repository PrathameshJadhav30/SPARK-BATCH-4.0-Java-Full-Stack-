import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Your City: ");
        String City = sc.nextLine();

        System.out.println("Hello, My Name is "+ name + ", I Am "+ age + " Year Old and I Live in "+ City + ".");
        sc.close();
    }
}
