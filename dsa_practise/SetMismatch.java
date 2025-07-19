import java.util.Arrays;

public class SetMismatch {

    static int[] findMismatch(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        // now after sorting we will check the mismatch element using for loop
        for(int index=0; index<arr.length; index++){
            if(arr[index] != index+1){
                return new int[]{arr[index], index+1};
            }
        }
        return new int[]{-1, -1};
    }
    
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2, 2};
        System.out.println(Arrays.toString(findMismatch(arr)));
    }
}
