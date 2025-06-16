public class BankCustomer {
    String name;
    int accountNumber;

    BankCustomer(String name, int accountNumber){
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public void display(){
        System.out.println("Name: " + name + ", A/C N0: " + this.accountNumber);
    }

    public static void main(String[] args) {
        BankCustomer c = new BankCustomer("Prathamesh", 12345678);
        c.display();
    }
}
