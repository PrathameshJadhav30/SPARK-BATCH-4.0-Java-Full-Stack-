abstract class Animal {
    abstract void makeSound();  //abstarct method

    void breathe() {         // Concrete method
        System.out.println("Breathing");
    }
}

class Dog extends  Animal {
    void makeSound(){
        System.out.println("Barks.....");
    }
}

public class TestAbstract {
    public static void main(String[] args) {
      Dog d = new Dog();
      d.makeSound();  //Barks
      d.breathe();   //Breadthing
    }
}
