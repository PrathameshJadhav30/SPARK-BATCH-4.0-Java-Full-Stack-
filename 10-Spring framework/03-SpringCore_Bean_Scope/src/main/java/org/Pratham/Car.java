package org.Pratham;

public class Car {

    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
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
