class Counter {
    int count = 0;
    public void increment() {
        count++;
    }
}

class WithoutSync extends Thread {
    Counter c;
    WithoutSync(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }

    public static void main(String[] args) throws Exception {
        Counter c = new Counter();
        WithoutSync t1 = new WithoutSync(c);
        WithoutSync t2 = new WithoutSync(c);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count: " + c.count); // May be less than 2000 due to race condition
    }
}
