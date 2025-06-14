import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a and b two Numbers: ");
     int a = sc.nextInt();
     int b = sc.nextInt();

     if(a > b){
         System.out.println(a + " is Greater");
     }else{
         System.out.println(b + " is greater");
     }
     sc.close();
    }
}
