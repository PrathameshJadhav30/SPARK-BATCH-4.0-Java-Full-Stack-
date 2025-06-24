class CounterSafe {
    int count = 0;
    public synchronized void increment() {
        count++;
    }
}

class WithSync extends Thread {
    CounterSafe c;
    WithSync(CounterSafe c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }

    public static void main(String[] args) throws Exception {
        CounterSafe c = new CounterSafe();
        WithSync t1 = new WithSync(c);
        WithSync t2 = new WithSync(c);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count: " + c.count); // Always 2000
    }
}
