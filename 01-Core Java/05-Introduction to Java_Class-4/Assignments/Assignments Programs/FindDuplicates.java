public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 4, 1};
        boolean[] visited = new boolean[arr.length];

        System.out.print("Duplicates: ");
        for(int i = 0; i < arr.length; i++){
            if(!visited[i]){
                boolean duplicateFound = false;
                for(int j = i + 1; j < arr.length; j++){
                    if(arr[i] == arr[j]){
                        duplicateFound = true;
                        visited[j] = true;
                    }
                }
                if(duplicateFound){
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
