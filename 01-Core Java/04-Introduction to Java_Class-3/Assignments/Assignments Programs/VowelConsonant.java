import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        char ch = new Scanner(System.in).next().toLowerCase().charAt(0);
        switch (ch) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}
