public class FirstMissingPositive {
    
    static int find(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i]>0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }

        //now the array is sorted now we will find the first missing positive
        for(int index=0; index<arr.length; index++){
            if(arr[index] != index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 11, 12};
        System.out.println(find(arr));
    }
}
