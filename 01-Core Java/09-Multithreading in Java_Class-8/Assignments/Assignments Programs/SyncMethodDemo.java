class Bank {
    private int balance = 1000;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        }
        System.out.println("Remaining balance: " + balance);
    }
}

class SyncMethodDemo extends Thread {
    Bank b;
    SyncMethodDemo(Bank b) {
        this.b = b;
    }

    public void run() {
        b.withdraw(300);
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        SyncMethodDemo t1 = new SyncMethodDemo(b);
        SyncMethodDemo t2 = new SyncMethodDemo(b);
        t1.start();
        t2.start();
    }
}
