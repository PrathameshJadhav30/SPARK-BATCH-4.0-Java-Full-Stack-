public class StringImmutable {
    public static void main(String[] args) {
        String original = "Prathamesh";
        original.concat("Jadhav"); //Not assigned back

        System.out.println(original); //Prathamesh (unchanged)

        String modified = original.concat("Jadhav");
        System.out.println(modified); //Prathamesh Jadhav
    }
}
