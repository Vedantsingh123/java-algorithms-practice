import java.util.Arrays;

public class Permutations {

    static void swap(char[] arr, int i, int idx){
        char temp = arr[idx];
        arr[idx] = arr[i];
        arr[i] = temp;
    }
    
    static void getPerms(char[] arr, int idx){
        if(idx == arr.length-1){
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i=idx; i<arr.length; i++){
            swap(arr, i, idx);
            getPerms(arr, idx+1);
            swap(arr, i, idx);
        }
    }
    public static void main(String[] args) {
        char[] arr = {'A', 'B', 'C'};
        getPerms(arr, 0);
    }
}
