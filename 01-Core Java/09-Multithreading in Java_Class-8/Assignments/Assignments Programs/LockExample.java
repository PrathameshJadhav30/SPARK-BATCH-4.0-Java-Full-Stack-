import java.util.concurrent.locks.ReentrantLock;

class SharedCounter {
    int count = 0;
    ReentrantLock lock = new ReentrantLock();

    void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }
}

public class LockExample extends Thread {
    SharedCounter s;
    LockExample(SharedCounter s) {
        this.s = s;
    }

    public void run() {
        for (int i = 0; i < 1000; i++){
            s.increment();
        }
    }

    public static void main(String[] args) throws Exception {
        SharedCounter s = new SharedCounter();
        LockExample t1 = new LockExample(s);
        LockExample t2 = new LockExample(s);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count: " + s.count); // Always 2000
    }
}
