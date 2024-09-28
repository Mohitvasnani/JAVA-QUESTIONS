package Coding_questions.Leetcode;

import java.util.Arrays;

public class Q34_FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int[] arr={5,7,7,7 ,7,10};
        System.out.println(Arrays.toString(BruteForce(arr,8)));
        System.out.println(Arrays.toString(searchRange(arr,7)));
    }
    static int[] searchRange(int[] nums, int target){
        int[] result = {-1,-1};
        result[0] = search(nums, target,true);
        if (result[0] != -1) {
            result[1] = search(nums, target, false);
        }
        return result;
    }
    static int search(int[] arr, int target, boolean FindIndex){
        int ans =-1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid]>target){
                end = mid-1;
            } else if (arr[mid]<target){
                start = mid+1;
            } else {
                ans = mid;
                if (FindIndex){
                    end = mid-1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
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
