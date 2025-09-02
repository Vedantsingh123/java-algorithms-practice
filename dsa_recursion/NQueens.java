public class NQueens {
    static void display(boolean[][] board){
        for (boolean[] row : board) {
            for (boolean element : row){
                if(element){
                    System.out.print("Q");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static boolean isSafe(boolean[][] board, int row, int col){
        //vertically check
        for(int i=0; i<row; i++){
            if(board[i][col]){
                return false;
            }
        }
        //left diagonal
        for(int i=row, j=col; i>=0 && j>=0; i--, j--){
            if(board[i][j]){
                return false;
            }
        }
        //right diagonal
        for(int i=row, j=col; i>=0 && j<board[0].length; i--, j++){
            if(board[i][j]){
                return false;
            }
        }
        return true;
    }
    static void nQueens(boolean[][] board, int row, int col){
        if(row == board.length){
            display(board);
            return;
        }
        for(int i=col; i<board[0].length; i++){
            if(isSafe(board, row, i)){
                board[row][i] = true;
                nQueens(board, row+1, col);
                board[row][i] = false;
            }
        }
    }
    public static void main(String[] args) {
        int n = 8;
        boolean[][] board = new boolean[n][n];
        nQueens(board, 0, 0);
    }
    
}
