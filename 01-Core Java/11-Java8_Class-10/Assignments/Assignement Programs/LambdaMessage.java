public class LambdaMessage {
    public static void main(String[] args) {
        Runnable message = () -> System.out.println("Hello from Lambda Expression....");
        message.run();
    }
}
