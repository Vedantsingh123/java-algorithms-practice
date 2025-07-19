
 import java.util.Arrays;
public class  BinarySearch2d{

    static int[] search(int[][] matrix, int target){
        int n = matrix.length;
        int m = matrix[0].length;
        int start = 0;
        int end = n*m+1;
        while(start<=end){
            int mid = start+(end-start)/2;
            int row = mid/m;
            int col = mid%m;
            if(target == matrix[row][col]){
                return new int[]{row, col};
            }else if(target>matrix[row][col]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args){
        int[][] matrix = {
                           {3,  4,  6,   8},  
                           {10, 12, 13, 15},
                           {17, 18, 19, 20}
                         };
        int target = 1;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

}

