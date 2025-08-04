public class LinearSearch {
    
    static int search(int[] arr, int target, int i){
        if(i > arr.length-1){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return search(arr, target, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 17, 18};
        int target = 18;
        System.out.println(search(arr, target, 0));
    }
}
