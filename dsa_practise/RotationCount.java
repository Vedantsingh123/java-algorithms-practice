public class RotationCount {
    
    static int count(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid+1;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid;
            }
            if(arr[start] <= arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {7, 9, 10, 1, 2, 3};
        System.out.println("Array is rotated: " + count(arr) + " times");
    }
}
