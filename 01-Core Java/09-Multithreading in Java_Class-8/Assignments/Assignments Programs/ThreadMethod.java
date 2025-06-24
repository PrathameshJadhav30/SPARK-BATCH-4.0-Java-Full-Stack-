public class ThreadMethod  extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread Running....");
        } catch(Exception e){

        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMethod t = new ThreadMethod();
        t.start();
        System.out.println("Is Alive: " + t.isAlive());
        t.join();
        System.out.println("After Join: " + t.isAlive());
    }
}
