public class SkipCharacterString { 
    static String skipChar(String str, char skip, int i, String ans){
        if(i == str.length()){
            return ans;
        }
        if(str.charAt(i) != skip){
            ans += str.charAt(i);
        }
        return skipChar(str, skip, i + 1 , ans);
    }
    public static void main(String[] args) {
        String str = "baccad";
        char skip = 'a';
        System.out.println(skipChar(str, skip, 0, ""));
    }
    
}
