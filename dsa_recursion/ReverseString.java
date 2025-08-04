public class ReverseString {
    
    static String revString(String str, int i, String rev){
        if(i < 0){
            return rev;
        }
        rev += str.charAt(i);
        return revString(str, i-1, rev);
    }
    public static void main(String[] args) {
        String str = "Vedant";
        String rev = "";
        System.out.println(revString(str, str.length()-1, rev));
    }
}
