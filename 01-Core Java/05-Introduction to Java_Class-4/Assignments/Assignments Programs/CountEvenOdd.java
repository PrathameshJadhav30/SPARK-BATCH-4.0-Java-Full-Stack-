public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = { 12, 1, 3, 5, 4, 8, 45, 23};
        int even = 0;
        int odd = 0;

        for(int num : arr){
            if(num % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even: "+ even + " , Odd: "+ odd);
    }
}
