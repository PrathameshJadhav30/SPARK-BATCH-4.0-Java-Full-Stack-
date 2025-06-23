public class LifeCycleDemo  extends  Thread{
    @Override
    public void run() {
        System.out.println("Running......");
    }

    public static void main(String[] args) {
        LifeCycleDemo t = new LifeCycleDemo(); //New
        t.start();  //Runnable , then Running
    }
}
