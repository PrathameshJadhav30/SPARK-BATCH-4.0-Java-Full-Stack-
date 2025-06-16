public class MobilePhone {
    String brand;
    double price;

    MobilePhone(){
        brand = "OPPO";
        price = 25000;
    }

    MobilePhone(String brand, double price){
        this.brand = brand;
        this.price = price;
    }
    public void show(){
        System.out.println("Brand: "+ brand + ", Price: " + price);
    }

    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone();
        MobilePhone m2 = new MobilePhone("iphone", 85000);
        m1.show();
        m2.show();
    }
}
