public class MazeCountingPath {
    static int countPath(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }
        return countPath(row - 1, col) + countPath(row, col - 1);
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        System.out.println(countPath(m, n));
    }
}
