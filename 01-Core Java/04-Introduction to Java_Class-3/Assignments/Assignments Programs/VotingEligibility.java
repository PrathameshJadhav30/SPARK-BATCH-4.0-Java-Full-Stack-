import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Do you have ID (true/false): ");
        boolean hasID = sc.nextBoolean();

        if(age >= 18){
            if(hasID){
                System.out.println("Allowed");
            }else{
                System.out.println("Denied- No ID");
            }
        }else{
            System.out.println("Denied - underage");
        }
    }
}
