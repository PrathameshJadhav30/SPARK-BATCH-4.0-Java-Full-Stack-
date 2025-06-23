public class StartVsRun  extends  Thread{
    public void run(){
        System.out.println("Run method: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        StartVsRun t1 = new StartVsRun();
        t1.run(); //Executes on main Thread (No Multithreading)
        t1.start();  //Starts a new Thread
    }
}
