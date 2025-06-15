public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 1};
        boolean[] counted = new boolean[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(!counted[i]){
                int count = 1;
                for(int j = i + 1; j < arr.length; j++){
                    if(arr[i] == arr[j]){
                        count++;
                        counted[j] = true;
                    }
                }
                System.out.println(arr[i] + " : " + count);
            }
        }
    }
}
