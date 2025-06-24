class Shared {
    int data;
    boolean valueSet = false;

    public synchronized void produce(int val) throws Exception {
        while (valueSet) wait();
        data = val;
        System.out.println("Produced: " + val);
        valueSet = true;
        notify();
    }

    public synchronized void consume() throws Exception {
        while (!valueSet) wait();
        System.out.println("Consumed: " + data);
        valueSet = false;
        notify();
    }
}

class Producer extends Thread {
    Shared s;
    Producer(Shared s) {
        this.s = s;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                s.produce(i);
                Thread.sleep(500);
            }
        } catch (Exception e) {

        }
    }
}

class Consumer extends Thread {
    Shared s;
    Consumer(Shared s) {
        this.s = s;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                s.consume();
                Thread.sleep(500);
            }
        } catch (Exception e) {

        }
    }
}

public class PCDemo {
    public static void main(String[] args) {
        Shared s = new Shared();
        new Producer(s).start();
        new Consumer(s).start();
    }
}
