package Coding_questions.Leetcode;

public class Q744_FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] character = {'c', 'f', 'j'};
        System.out.println(Smallest(character,'c'));
    }
    static char Smallest(char[] letter, char target){
        int start= 0;
        int end = letter.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if (target < letter[mid]) {
                end = mid-1;
            } else {
                start = mid +1;
            }
        }
        if (start == letter.length) return letter[0];
        return letter[start];

    }

}
