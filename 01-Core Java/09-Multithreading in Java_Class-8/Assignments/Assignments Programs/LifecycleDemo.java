public class LifecycleDemo extends Thread{
    @Override
    public void run() {
        System.out.println("RUNNABLE state");
        try {
            Thread.sleep(1000);
        } catch (Exception e){

        }
        System.out.println("TERMINATED state");
    }

    public static void main(String[] args) {
        LifecycleDemo t = new LifecycleDemo();
        System.out.println("NEW state");
        t.start();  //Becomes RUNNABLE, then TERMINATED
    }
}
