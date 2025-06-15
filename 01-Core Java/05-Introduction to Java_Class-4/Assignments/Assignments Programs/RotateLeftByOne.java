public class RotateLeftByOne {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int first = arr[0];

        for(int i = 1; i < arr.length; i++){
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;

        System.out.println("Rotated array: ");
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
