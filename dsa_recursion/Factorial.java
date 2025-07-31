public class Factorial {
    
    static int findFactorial(int n){
    if(n == 1){
        return 1;
    }
    return n * findFactorial(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findFactorial(n));
}
}
