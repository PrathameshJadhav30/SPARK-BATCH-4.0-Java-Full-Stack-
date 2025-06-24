public class MainThreadName {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t.getName());
        t.setName("MyMainThread");
        System.out.println("Renamed thread: " + t.getName());
    }
}
