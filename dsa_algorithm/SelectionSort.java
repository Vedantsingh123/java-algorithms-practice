import java.util.Arrays;

public class SelectionSort { 

    static void sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
                int temp = arr[i];
                arr[i]   = arr[smallest];
                arr[smallest] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, -3, 0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
