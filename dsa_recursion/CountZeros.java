public class CountZeros {
    
    static int zero(int number, int count){
     if(number == 0){
        return count;
     }
        if(number%10 == 0){
           return zero(number/10, count+1);
        }
           return zero(number/10, count);
    }
    public static void main(String[] args) {
        int number = 1200050;
        System.out.println(zero(number, 0));
    }
}
