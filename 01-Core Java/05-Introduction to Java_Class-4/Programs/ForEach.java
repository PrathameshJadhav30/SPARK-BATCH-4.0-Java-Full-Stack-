public class ForEach {
    public static void main(String[] args) {
        // Declare and initialize an integer array
        int[] numbers = {10, 20, 30, 40, 50};

        // Using for-each loop to iterate over the array
        System.out.println("Elements in the array:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Another example: for-each loop on a String array
        String[] fruits = {"Apple", "Banana", "Mango"};

        System.out.println("\nFruits in the basket:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
