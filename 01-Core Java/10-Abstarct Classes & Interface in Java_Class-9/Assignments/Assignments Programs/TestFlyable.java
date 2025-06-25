interface Flyable {
    void fly();
}

class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Bird flies in the sky.");
    }
}

public class TestFlyable {
    public static void main(String[] args) {
       Flyable bird = new Bird();
       bird.fly();
    }
}
