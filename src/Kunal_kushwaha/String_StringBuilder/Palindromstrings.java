package Kunal_kushwaha.String_StringBuilder;

public class Palindromstrings {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(Onlystring(str));

    }
    static boolean IsPalindrome(String str){
         StringBuffer sb = new StringBuffer(str);
         sb.reverse();
        return sb.toString().equals(str);
    }
    static boolean Onlystring(String str){
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            if (arr[start]!=arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
