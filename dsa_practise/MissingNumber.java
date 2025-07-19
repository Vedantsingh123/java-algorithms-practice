public class MissingNumber {

    static int findNumber(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }
        // find number after sorting
        for(int index=0; index<arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(findNumber(arr));
    }
}
