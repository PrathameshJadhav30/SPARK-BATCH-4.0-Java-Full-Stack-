import java.util.concurrent.locks.ReentrantLock;

class LockBank {
    private int balance = 1000;
    ReentrantLock lock = new ReentrantLock();

    public void withdraw(int amount) {
        lock.lock();
        try {
            if (balance >= amount) balance -= amount;
            System.out.println("Remaining: " + balance);
        } finally {
            lock.unlock();
        }
    }
}
