import java.util.Arrays;

public class QuickSort {

    static int partitionIndex(int[] arr, int low, int high){
        int pivot = low;
        int i = low;
        int j = high;
        while(i < j){
            while(arr[i] <= arr[pivot] && i < high){
                i++;
            }
            while(arr[j] > arr[pivot] && j > low){
                j--;
            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int p = partitionIndex(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high); 
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 6, 4, 5, 7, 9, 1, 3};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
