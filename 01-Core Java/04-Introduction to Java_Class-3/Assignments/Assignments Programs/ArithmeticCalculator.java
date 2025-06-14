import java.util.Scanner;
public class ArithmeticCalculator {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter a Second Number: ");
        int b = sc.nextInt();

        System.out.println("Addition: "+ (a + b));
        System.out.println("Subtraction: "+ (a - b));
        System.out.println("Multiplication: "+ (a * b));
        System.out.println("Division: "+ (a / b));
        System.out.println("Modulus: "+ (a % b));
        sc.close();
    }
}
