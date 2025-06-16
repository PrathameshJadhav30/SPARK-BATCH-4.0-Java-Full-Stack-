 class Vehicle {
    public void start(){
        System.out.println("Vehicle Starting.....");
    }
}
class Car extends Vehicle{
    public void speedUp(){
        System.out.println("Car Speeding up....");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.speedUp();
    }
}