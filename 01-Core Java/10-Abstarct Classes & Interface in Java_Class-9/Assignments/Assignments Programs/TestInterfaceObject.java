interface Demo {
    void test();
}

public class TestInterfaceObject {
    public static void main(String[] args) {
        // Demo obj = new Demo(); //  Error: Cannot instantiate the type Demo
        System.out.println("Cannot create object of interface directly.");
    }
}
//You cannot create an object of an interface because it has no implementation. You must implement it in a class first, and then create an object of that class.