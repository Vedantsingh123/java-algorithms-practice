public class PalindromeCheck {

    static int reverseNumber(int number, int rev){
    if(number == 0){
        return rev;
    }
        rev = rev * 10 + number%10;
        return reverseNumber(number/10, rev);
    }
    
    static boolean isPalindrome(int number){
        int reversed = reverseNumber(number, 0);
        return number == reversed;
    }
    public static void main(String[] args) {
        int number = 14321;
        System.out.println(isPalindrome(number));
    }
}
