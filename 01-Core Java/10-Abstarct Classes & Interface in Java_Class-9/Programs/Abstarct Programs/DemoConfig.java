interface Config {
    int MAX_USERS = 100;  //Public static final by default
}

public class DemoConfig {
    public static void main(String[] args) {
        System.out.println("Max Allowed Users: " + Config.MAX_USERS);
    }
}
