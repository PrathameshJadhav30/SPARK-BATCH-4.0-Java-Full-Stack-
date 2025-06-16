public class Laptop {
    String brand;
    double price;
    int RAM;

    public void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("RAM: " + RAM +"GB");
    }

    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.brand = "HP";
        l.price = 550000;
        l.RAM = 16;
        l.displayDetails();
    }
}
