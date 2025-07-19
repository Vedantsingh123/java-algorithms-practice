import java.util.Arrays;

public class InsertionSort {

    static void sort(int[] arr){
    for(int i=1; i<arr.length; i++){
        int current = arr[i];
        int j = i-1;
        while(j>=0 && current < arr[j]){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = current;
    }
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
