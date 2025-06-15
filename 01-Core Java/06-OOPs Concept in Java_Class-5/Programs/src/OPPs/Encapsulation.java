package OPPs;

class BankAccount {
    private double balance;  //Private Variable

    public void deposit(double amount){
        balance += amount;
    }

    public double getBalance(){
        return balance;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(5000);
        System.out.println("Balance: "+ acc.getBalance());
    }
}
