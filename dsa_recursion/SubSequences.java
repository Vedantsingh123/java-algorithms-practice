public class SubSequences {
    static void subSequence(String str, String subSeq, int i){
        if(i == str.length()){
            System.out.print(subSeq + " ");
            return; 
        }
        subSequence(str, subSeq + str.charAt(i), i + 1);
        subSequence(str, subSeq, i + 1);

    }
    public static void main(String[] args) {
        String str = "abc";
        subSequence(str, "", 0);
    }
}
