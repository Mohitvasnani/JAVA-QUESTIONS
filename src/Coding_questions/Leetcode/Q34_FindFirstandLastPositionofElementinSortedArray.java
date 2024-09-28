package Coding_questions.Leetcode;

import java.util.Arrays;

public class Q34_FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};

        System.out.println(Arrays.toString(BruteForce(arr,8)));
    }
    static int[] BruteForce(int[] nums, int target) {
        int[] result = {-1,-1};
        for(int i=0; i<=nums.length-1; i++){
            if(nums[i]==target){
                result[0]=i;
                break;
            }
        }
        for(int j = nums.length-1; j>=0; j--){
            if(nums[j]==target){
                result[1]=j;
                break;
            }
        }
        return result;
    }
}
