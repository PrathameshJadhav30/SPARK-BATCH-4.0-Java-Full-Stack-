public class PriorityDemo extends  Thread{
    @Override
    public void run() {
        System.out.println(getName() + " Priority: " + getPriority());
    }

    public static void main(String[] args) {
        PriorityDemo t1 = new PriorityDemo();
        PriorityDemo t2 = new PriorityDemo();
        PriorityDemo t3 = new PriorityDemo();

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.setPriority(3);
        t2.setPriority(7);
        t3.setPriority(10);

        t1.start();
        t2.start();
        t3.start();
    }
}
