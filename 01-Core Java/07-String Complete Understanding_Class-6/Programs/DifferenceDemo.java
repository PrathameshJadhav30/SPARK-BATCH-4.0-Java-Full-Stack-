public class DifferenceDemo {
    //Difference Between String, StringBuffer, StringBuilder
    public static void main(String[] args) {
        String s = "Prathamesh";
        s.concat(" Jadhav");  //doesn't change original string
        System.out.println("String: " + s);

        StringBuffer sb = new StringBuffer("Prathamesh");
        sb.append(" Jadhav");
        System.out.println("StringBuffer: " + sb);

        StringBuilder sb2 = new StringBuilder("Prathamesh");
        sb2.append(" Jadhav");
        System.out.println("StringBUilder: " + sb2);
    }
}
