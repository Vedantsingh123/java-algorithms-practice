import java.util.ArrayList;

public class DisappearedNumber {

    static ArrayList<Integer> findNumbers(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }
        // find disappeared number after sorting
        ArrayList<Integer> ans = new ArrayList<>();
        for(int index=0; index<arr.length; index++){
            if(arr[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
        }
    
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findNumbers(arr));
    }
}
