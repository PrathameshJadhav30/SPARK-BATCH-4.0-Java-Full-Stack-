public class UnaryOperators {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Prefix ++x: "+ (++x)); //6
        x = 5;
        System.out.println("Postfix x++: "+ (x++)); //5
        System.out.println("After Postfix, x: "+ x); //6
    }
}
