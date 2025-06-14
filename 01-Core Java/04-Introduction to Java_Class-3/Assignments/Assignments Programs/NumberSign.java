import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
       int num = new Scanner(System.in).nextInt();
       if(num > 0){
           System.out.println("Positive");
       }else if(num < 0){
           System.out.println("Negative");
       }else{
           System.out.println("Zero");
       }

    }
}
