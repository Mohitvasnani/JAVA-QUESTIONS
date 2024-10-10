package Kunal_kushwaha.String_StringBuilder;

public class Palindromstrings {
    public static void main(String[] args) {
        String str = "abcdca";
        System.out.println(IsPalindrome(str));

    }
    static boolean IsPalindrome(String str){
         StringBuffer sb = new StringBuffer(str);
         sb.reverse();

        return sb.toString().equals(str);
    }
}
