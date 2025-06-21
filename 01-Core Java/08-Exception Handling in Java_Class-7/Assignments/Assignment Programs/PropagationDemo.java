public class PropagationDemo {
    static void method1() throws Exception {
        throw new Exception("Error thrown in method1");
    }
    static void method2() throws Exception {
        method1();
    }

    public static void main(String[] args) {
        try {
            method2();
        } catch(Exception e){
            System.out.println("Caught in main: " + e.getMessage());
        }
    }
}
