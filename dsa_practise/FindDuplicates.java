
import java.util.HashSet;

public class FindDuplicates {
    
    static HashSet<Integer> findNumbers(int[] arr){
        int i = 0;
        HashSet<Integer> ans = new HashSet<>();
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                if(i != correctIndex){
                 ans.add(arr[i]);
                }
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findNumbers(arr));
    }
}
