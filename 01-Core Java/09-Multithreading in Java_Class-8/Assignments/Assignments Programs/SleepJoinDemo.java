public class SleepJoinDemo extends Thread{
    @Override
    public void run() {
        for(int i = 1; i <= 3; i++){
            try{
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + " - " + i);
            } catch (Exception e){

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SleepJoinDemo t1 = new SleepJoinDemo();
        SleepJoinDemo t2 = new SleepJoinDemo();

        t1.start();
        t1.join();  //t2 will start only after t1 completes
        t2.start();
    }
}
