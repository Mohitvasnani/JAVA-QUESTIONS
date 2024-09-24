package Coding_questions.Leetcode;

public class Q1295_FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {22,222,2222,2,123,2,345,2,567,56};
        System.out.println(findNumbers(nums));
    }

     static int findNumbers(int[] nums) {
        int count =0;
        for(int num: nums){
            if(iseven(num)){
                count++;
            }
        }

        return count;
    }
    static boolean iseven(int num){
        int count = digits(num);
        return count%2==0;
    }
    static int digits(int num){
        int count = 0;
        while(num>0){
            int rem = num%10;
            num = num/10;
            count++;
        }
        return count;
    }
}
