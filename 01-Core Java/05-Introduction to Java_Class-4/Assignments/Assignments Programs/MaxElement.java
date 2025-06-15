public class MaxElement {
    public static void main(String[] args) {
        int[] arr = { 7,2,4,8,34};
        int max = arr[0];

        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        System.out.println("Max: "+ max);
    }
}
