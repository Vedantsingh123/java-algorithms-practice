public class NKnights {
     static void display(boolean[][] board){
        for (boolean[] row : board) {
            for (boolean element : row){
                if(element){
                    System.out.print("K");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static boolean isValid(boolean[][] board, int row, int col){
        if(row>=0 && row<board.length && col>=0 && col<board.length){
            return true;
        }
        return false;
    }

    static boolean isSafe(boolean[][] board, int row, int col){
        if(isValid(board, row-2, col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if(isValid(board, row-2, col+1)){
            if(board[row-2][col+1]){
               return false;
            }
        }
        if(isValid(board, row-1, col+2)){
            if(board[row-1][col+2]){
               return false;
            }
        }
        if(isValid(board, row+1, col+2)){
            if(board[row+1][col+2]){
                return false;
            }
        }
        if(isValid(board, row+1, col-2)){
            if(board[row+1][col-2]){
               return false;
            }
        }
        if(isValid(board, row-1, col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        if(isValid(board, row+2, col+1)){
            if(board[row+2][col+1]){
                return false;
            }
        }
        if(isValid(board, row+2, col-1)){
            if(board[row+2][col-1]){
                return false;
            }
        }
        return true;
    }

    static void nKnights(boolean[][] board, int row, int col, int n){
        if(n == 0){
            display(board);
            return;
        }
        if (row == board.length) {
            return;
        }

        if(col == board[0].length){
            nKnights(board, row+1, 0, n);
            return;
        }
        
         if(isSafe(board, row, col)){
             board[row][col] = true;
             nKnights(board, row, col+1, n-1);
             board[row][col] = false;  
        }
        nKnights(board, row, col+1, n);
    }
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        nKnights(board, 0, 0, n);
    }
    
}
