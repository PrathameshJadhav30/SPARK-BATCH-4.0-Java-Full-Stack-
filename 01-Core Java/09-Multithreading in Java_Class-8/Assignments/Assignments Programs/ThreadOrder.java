public class ThreadOrder extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "is Running...");
    }

    public static void main(String[] args) {
        ThreadOrder t1 = new ThreadOrder();
        ThreadOrder t2 = new ThreadOrder();
        t1.setName("Thread - 1");
        t2.setName("Thread - 2");
        t1.start();
        t2.start();
    }
}
