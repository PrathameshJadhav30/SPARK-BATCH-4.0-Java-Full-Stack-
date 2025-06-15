public class OneDArraySum {
    public static void main(String[] args) {
        int[] marks = {80, 90, 85, 70, 75};
        int total = 0;

        for(int mark: marks){
            total += mark;
        }
        System.out.println("Total Marks: " + total);
    }
}
