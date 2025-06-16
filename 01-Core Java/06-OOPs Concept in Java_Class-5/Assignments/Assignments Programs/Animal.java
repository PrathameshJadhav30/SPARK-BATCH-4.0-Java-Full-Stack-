class Animal {
    void makeSound(){
        System.out.println("Some animal Sound");
    }
}

class Lion extends Animal{
    void makeSound(){
        System.out.println("Roar!");
    }

    public static void main(String[] args) {
        Animal a = new Lion();
        a.makeSound();
    }
}
