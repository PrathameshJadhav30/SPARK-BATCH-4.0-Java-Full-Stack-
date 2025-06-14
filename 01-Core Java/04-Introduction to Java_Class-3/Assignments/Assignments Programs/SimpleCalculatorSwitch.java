import java.util.Scanner;

public class SimpleCalculatorSwitch {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a two Numbers: ");
       double a = sc.nextDouble();
       double b = sc.nextDouble();
        System.out.println("Enter a Operation: ");
       char op = sc.next().charAt(0);

       switch(op) {
           case '+' :
               System.out.println(a + b);
               break;
           case '-':
               System.out.println(a - b);;
               break;
           case '*':
               System.out.println(a * b);
               break;
           case '/':
               System.out.println(a / b);
               break;
           case '%':
               System.out.println(a % b);
               break;
           default:
               System.out.println("Invalid Operators");
       }
    }
}
