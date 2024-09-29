package Coding_questions.Leetcode;

public class Q162_FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(Find(nums, 4));

    }
    static int Find(int[] arr, int target){
        int peak = findPeakElement(arr);
        int FirstHalf = AgnosticBinary(arr, target, 0, peak);
        if (FirstHalf!=-1){
            return FirstHalf;
        }
        return AgnosticBinary(arr, target, peak+1, arr.length-1);
    }
    static int AgnosticBinary(int[] arr, int target, int start, int end){
        boolean IsAscending = arr[end]> arr[start];
        while (start<=end){
            int mid = start + (end - start)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (IsAscending){
                if (target>arr[mid]){
                    start = mid +1;
                } else {
                    end = mid -1;
                }
            } else {
                if (target<arr[mid]){
                    start = mid+1;
                } else {
                    end = mid -1;
                }
            }
        }
        return -1;
    }
    static int findPeakElement(int[] nums) {
        int start =0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(nums[mid]>nums[mid+1]){
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return end;
    }

}
