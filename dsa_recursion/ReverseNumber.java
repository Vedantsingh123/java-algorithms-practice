public class ReverseNumber {
    
    static int reverse(int number, int rev){
        if(number == 0){
            return rev;
        }
        rev = rev * 10 + number%10;
        return reverse(number/10, rev);
    }
    public static void main(String[] args) {
        int number = 1234;
        System.out.println(reverse(number, 0));
    }
}
