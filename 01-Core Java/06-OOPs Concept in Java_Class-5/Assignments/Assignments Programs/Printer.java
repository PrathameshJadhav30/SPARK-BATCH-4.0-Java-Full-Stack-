public class Printer {
    void print(int num){
        System.out.println("Integer: " + num);
    }

    void print(String text){
        System.out.println("String: " + text);
    }

    void print(double value){
        System.out.println("Double: " + value);
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(10);
        p.print("Prathamesh Jadhav");
        p.print(3.14);
    }
}
