class Organism {
    void live(){
        System.out.println("Living Organism");
    }
}

class Animal1 extends Organism{
    void breathe(){
        System.out.println("Animal Breathes");
    }
}

class Human extends Animal1{
    void think(){
        System.out.println("Human Think");
    }

    public static void main(String[] args) {
        Human h = new Human();
        h.live();
        h.breathe();
        h.think();
    }
}