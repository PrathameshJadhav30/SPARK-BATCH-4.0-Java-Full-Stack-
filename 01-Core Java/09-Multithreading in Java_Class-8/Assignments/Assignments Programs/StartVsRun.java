public class StartVsRun extends Thread{
    @Override
    public void run() {
        System.out.println("Running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        StartVsRun t = new StartVsRun();
        t.run();  //No new thread; runs in main thread
        t.start(); //starts a new thread
    }
}
