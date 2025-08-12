import java.util.Arrays;

public class SelectionSort {
    static int findMinIndex(int[] arr, int start, int end){
        if(start == end){
            return start;
        }

        int minIndexInRest = findMinIndex(arr, start + 1, end);
        if(arr[start] < arr[minIndexInRest]){
            return start;
        }else{
            return minIndexInRest;
        }
    }
    static int[] sort(int[] arr, int start){
        int n = arr.length-1;
        if(start>=n){
            return arr;
        }

        int minIndex = findMinIndex(arr, start, n);
        
        if(minIndex != start){
            int temp = arr[start];
            arr[start] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return sort(arr, start+1);
    }
    public static void main(String[] args) {
        int[] arr = {2, 10, 3, 6, 7, 1};
        System.out.println(Arrays.toString(sort(arr, 0)));
    }
}
