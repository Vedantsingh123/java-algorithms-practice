import java.util.Arrays;

public class MergeSort {

    static void merge(int[] arr,int low, int mid, int high){
        int [] temp = new int[high - low +1];
        int left = low;
        int right = mid+1;
        int k = 0;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[k++] = arr[left++];
            }else{
                temp[k++] = arr[right++];
            }
        }
        while(left <= mid){
            temp[k++] = arr[left++];
        }
        while(right <= high){
            temp[k++] = arr[right++];
        }
        for(int i=low, j=0; i<=high; i++, j++){
            arr[i] = temp[j];
        }
       
    }
    
    static void mergeSort(int[] arr, int low, int high){
        if(low == high){
            return;
        }

        int mid = low + (high - low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);

    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 2, 7, 2, 6};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
