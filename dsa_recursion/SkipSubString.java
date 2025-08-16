public class SkipSubString {

    static String skipString(String str, String skip){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith(skip)){
            return skipString(str.substring(skip.length()) , skip);
        }else{
            return str.charAt(0) + skipString(str.substring(1), skip);
        }
    }
    public static void main(String[] args) {
        String str = "abcxyzabcabc";
        String skip = "abc";
        System.out.println(skipString(str, skip));
    }
    
}
