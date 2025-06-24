interface  Flyable {
    void fly();  //Implicitly public abstarct
}

class Birds implements Flyable {

    @Override
    public void fly() {
        System.out.println("Bird flies in the sky....");
    }
}


public class TestInterface {
    public static void main(String[] args) {
        Birds b = new Birds();
        b.fly();
    }
}
