interface Vehicle {
    void start();

    default  void stop() {
        System.out.println("Default Method, Vehicle stopped...");
    }
}

class  car implements Vehicle {
    public void start() {
        System.out.println("Car started...");
    }
}
public class DefaultMethodDemo {
    public static void main(String[] args) {
       car car = new car();
       car.start();
       car.stop();
    }
}
