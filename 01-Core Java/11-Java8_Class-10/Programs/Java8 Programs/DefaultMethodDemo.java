interface Vehicle {
    void run();  //abstarct method

    default void fuelType(){
        System.out.println("Fuel Type: Petrol....");
    }
}
class Bike implements Vehicle {
    @Override
    public void run() {
        System.out.println("Bike is Running...");
    }
}

public class DefaultMethodDemo {
    public static void main(String[] args) {
       Vehicle b = new Bike();
       b.run();
       b.fuelType();  //default method called
    }
}
