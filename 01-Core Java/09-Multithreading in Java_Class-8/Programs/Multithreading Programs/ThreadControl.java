public class ThreadControl  extends Thread{
    @Override
    public void run() {
        try {
            for(int i = 0; i < 5; i++){
                System.out.println("Thread running.....");
                Thread.sleep(500); //Prevent execution temporarily
            }
        } catch (InterruptedException e){
            System.out.println("Thread Interrupted");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadControl t = new ThreadControl();
        t.start();
        t.join();  //Waits for t to finish
    }
}
