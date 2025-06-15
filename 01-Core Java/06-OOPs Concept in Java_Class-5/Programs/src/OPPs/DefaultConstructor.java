package OPPs;

class Anaimal {
    String type;

    Anaimal(){
        type = "Dog";
    }

    void show(){
        System.out.println("Animal Type: " + type);
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
        Anaimal a = new Anaimal();
        a.show();
    }
}
