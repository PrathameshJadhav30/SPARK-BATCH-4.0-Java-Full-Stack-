public class WaitError {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        lock.wait(); // IllegalMonitorStateException
    }
}
