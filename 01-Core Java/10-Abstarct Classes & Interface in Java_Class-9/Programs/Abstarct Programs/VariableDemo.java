abstract class AbstarctExample {
    int normalVar = 10;     //instance variable
    static int staticVar = 20;  // static Variable
}

interface  InterfaceExample {
    int CONSTANT = 100;  //public static final
}

public class VariableDemo {
    public static void main(String[] args) {
        System.out.println("Interface constant: " + InterfaceExample.CONSTANT);
        System.out.println("Static variable from abstarct: " + AbstarctExample.staticVar);
    }
}
