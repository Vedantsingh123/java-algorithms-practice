import java.util.Arrays;

public class BubbleSort {
    
    static void sort(int[] arr, int i, int j){
        if(i<0){
            System.out.println(Arrays.toString(arr));
            return;
        }
        if(j<i){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            sort(arr, i, j+1);
        }
        else{
                sort(arr, i-1, 0);
            }
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 6, 4};
        sort(arr, arr.length-1, 0);
    }
}
