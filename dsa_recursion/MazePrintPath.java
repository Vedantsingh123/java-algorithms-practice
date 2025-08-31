public class MazePrintPath {
    static void printPath(int row, int col, String path){
        if(row == 1 && col == 1){
            System.out.println(path);
            return;
        }
        if(row > 1){
            printPath(row - 1, col, path + "D");
        }
        if(col > 1){
            printPath(row, col - 1, path + "R");
        }
    }
     public static void main(String[] args) {
        int m = 3;
        int n = 3;
        printPath(m, n, "");
    }
}
