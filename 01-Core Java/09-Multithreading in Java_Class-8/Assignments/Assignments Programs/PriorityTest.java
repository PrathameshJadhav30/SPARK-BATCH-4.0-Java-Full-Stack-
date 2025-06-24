public class PriorityTest extends Thread{
    @Override
    public void run() {
        System.out.println(getName() + " Priority: " + getPriority());
    }

    public static void main(String[] args) {
        PriorityTest t1 = new PriorityTest();
        PriorityTest t2 = new PriorityTest();
        t1.setName("Low Priority Thread");
        t2.setName("High Priority Thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
