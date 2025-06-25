abstract  class Vehicle {
    abstract void start();  //Abstarct method

    void fuelType(){  //Concrete Method
        System.out.println("Fuel Type: Petorl or Diesel");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick or self-start.");
    }
}


public class TestVehicle {
    public static void main(String[] args) {
      Vehicle myBike = new Bike();
      myBike.start();
      myBike.fuelType();
    }
}
