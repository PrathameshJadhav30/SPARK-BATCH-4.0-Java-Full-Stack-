public class ThreadSchedulerDemo {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("Running: " + Thread.currentThread().getName());
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
        //Scheduler decides which thread run first - Platform Dependent
    }
}
