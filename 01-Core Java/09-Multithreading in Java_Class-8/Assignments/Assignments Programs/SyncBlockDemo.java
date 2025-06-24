class BankBlock {
    private int balance = 1000;

    public void withdraw(int amount) {
        synchronized (this) {
            if (balance >= amount) {
                balance -= amount;
            }
            System.out.println("Remaining balance: " + balance);
        }
    }
}

class SyncBlockDemo extends Thread {
    BankBlock b;
    SyncBlockDemo(BankBlock b) {
        this.b = b;
    }

    public void run() {
        b.withdraw(300);
    }

    public static void main(String[] args) {
        BankBlock b = new BankBlock();
        SyncBlockDemo t1 = new SyncBlockDemo(b);
        SyncBlockDemo t2 = new SyncBlockDemo(b);
        t1.start();
        t2.start();
    }
}
