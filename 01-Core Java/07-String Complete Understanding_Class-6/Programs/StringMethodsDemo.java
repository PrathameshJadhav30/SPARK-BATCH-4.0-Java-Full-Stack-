public class StringMethodsDemo {
    //Useful String Methods
    public static void main(String[] args) {
        String str1 = " Java Programming ";

        System.out.println("Length: " + str1.length());
        System.out.println("Trimmed: " + str1.trim());
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Substring: " + str1.substring(1, 5));
        System.out.println("Replace: " + str1.replace(" Java", "C++"));
        System.out.println("CharAt(2): " + str1.charAt(2));
        System.out.println("Contain 'Prog' : " + str1.contains("Prog"));
    }
}