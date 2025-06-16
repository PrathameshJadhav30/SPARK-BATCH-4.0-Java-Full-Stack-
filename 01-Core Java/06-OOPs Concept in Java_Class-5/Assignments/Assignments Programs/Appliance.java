abstract class Appliance {
    abstract void turnOn();
}

class WashingMachine extends Appliance{
    void turnOn(){
        System.out.println("Washing Machine is Now ON");
    }

    public static void main(String[] args) {
        Appliance a = new WashingMachine();
        a.turnOn();
    }
}
