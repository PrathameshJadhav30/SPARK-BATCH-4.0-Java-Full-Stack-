public class ThreadMethods  extends  Thread{
    @Override
    public void run() {
        try {
            System.out.println("Sleeping for 1 Sec");
            Thread.sleep(1000);
            System.out.println("Is Alive: " + this.isAlive());
        } catch(InterruptedException e){
            System.out.println("Interrupted");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMethods t = new ThreadMethods();
        System.out.println("Alive before start: " + t.isAlive());
        t.start();
        t.join();   // Wait for thread to die
        System.out.println("Alive after join: " + t.isAlive());
    }
}
