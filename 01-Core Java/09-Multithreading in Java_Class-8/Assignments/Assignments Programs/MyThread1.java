public class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread running via Thread class");
    }

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();
    }
}
