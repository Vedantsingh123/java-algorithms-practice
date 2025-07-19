public class FindDuplicate {

    static int findNumber(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                if(i != correctIndex){
                    return arr[i];
                }
                i++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(findNumber(arr));
    }
    
}
