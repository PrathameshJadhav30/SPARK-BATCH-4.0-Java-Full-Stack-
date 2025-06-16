class Bird {
    void fly(){
        System.out.println("Bird is flying");
    }
}

class Eagle extends Bird{
    void fly(){
        System.out.println("Eagle soars High");
    }

    public static void main(String[] args) {
        Bird b = new Eagle(); //Parent reference
        b.fly();  ///Runtime polymorphism
    }
}
