interface Constants {
    int MAX = 100; //Implicitly public static final
}

public class InterfaceConstantsTest {
    public static void main(String[] args) {
        System.out.println("Max: " + Constants.MAX);
        //Constants.MAX = 200;  // Error: cannot assign a value to final variable
    }
}
