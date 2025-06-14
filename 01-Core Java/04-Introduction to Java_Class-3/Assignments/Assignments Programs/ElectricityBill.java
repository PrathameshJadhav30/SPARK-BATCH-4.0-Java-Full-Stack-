import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units: ");
        int units = sc.nextInt();
        double bill = 0;

        if (units <= 100){
            bill = units * 1.5;
        }
        else if (units <= 200){
            bill = 100 * 1.5 + (units - 100) * 2.5;
        }
        else{
            bill = 100 * 1.5 + 100 * 2.5 + (units - 200) * 3.5;
        }

        bill += 50; // fixed charge

        if (bill > 500) {
            bill += 0.10 * bill; // 10% surcharge
        }

        System.out.println("Total Bill: ₹" + bill);
    }
}
