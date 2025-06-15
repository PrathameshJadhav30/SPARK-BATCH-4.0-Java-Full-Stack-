package OPPs;

class car {
    String brand;

    //constructor
    car() {
        brand = "Tata";
    }

    void show(){
        System.out.println("Car brand: " + brand);
    }
}
public class Constructor {
    public static void main(String[] args) {
        car c = new car(); //Constructor is Automatically called
        c.show();
    }
}
