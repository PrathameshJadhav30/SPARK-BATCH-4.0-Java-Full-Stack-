package org.Pratham;

public class Car {

    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public Car(){
        System.out.println("Car Default Constructor....");
    }

    public Car(Engine engine) {
        System.out.println("Car Constructor.........");
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        System.out.println("Set engine() Called...........");
        this.engine = engine;
    }

    public void Drive(){
        int start = engine.start();

        if(start >= 1){
            System.out.println("Let's Drive");
        }else {
            System.out.println("Engine yet Not Started...");
        }
    }
}
