import java.util.Arrays;

public class StairCase{

    static int[] search(int[][] matrix, int target){
        int row = 0;
        int coulmn = matrix.length-1;
        while(row<matrix.length && coulmn>=0){
            if(target == matrix[row][coulmn]){
                return new int[]{row, coulmn};
            }else if(target<matrix[row][coulmn]){
                coulmn--;
            }else{
                row++;
            }
        }    
        return new int[]{-1, -1};
    }
public static void main(String[] args) {
   int[][] matrix =  {
                       {10, 20, 30, 40},
                       {15, 25, 35, 45},
                       {28, 29, 37, 45},
                       {33, 34, 38, 50},
                     }; 
    int target = 28;
    System.out.println(Arrays.toString(search(matrix, target)));                 
}
}
