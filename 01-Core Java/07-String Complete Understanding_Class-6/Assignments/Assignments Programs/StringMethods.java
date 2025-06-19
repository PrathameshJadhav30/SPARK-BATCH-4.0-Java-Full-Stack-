public class StringMethods {
    public static void main(String[] args) {
        String str = "  Java Programming ";

        System.out.println("charAt(2): " + str.charAt(2));
        System.out.println("substring(2, 6): " + str.substring(2, 6));
        System.out.println("replace 'a' with 'o': " + str.replace('a', 'o'));
        System.out.println("trim(): " + str.trim());
        System.out.println("toUpperCase(): " + str.toUpperCase());
        System.out.println("toLowerCase(): " + str.toLowerCase());
    }
}
