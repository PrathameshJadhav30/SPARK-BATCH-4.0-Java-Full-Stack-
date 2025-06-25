class AbstractExample {
    int number = 10;  //Instance variable (not final)
}
interface InterfaceExample{
    int VALUE = 100;  //Implicitly public static final
}

public class VariableDemo {
    public static void main(String[] args) {
       //Accessing interface constant
        System.out.println("Interface Constant: " + InterfaceExample.VALUE);

        //Accessing abstarct class variable via subclass
        AbstractExample obj = new AbstractExample() ; {

        }; //Anonymous subclass
        System.out.println("Abstarct class Variable: " + obj.number);
    }
}
