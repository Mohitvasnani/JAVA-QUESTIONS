package Coding_questions.Leetcode;

public class Q1095_FindinMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,5,4,3,2,1};
        System.out.println(searchinmount(arr,1));

    }
    static int searchinmount(int[] arr, int target){
        int peak = findpeak(arr);
        int firsthalf = binary(arr, target, 0, peak);
        if (firsthalf!=-1){
            return firsthalf;
        }
        return binary(arr, target, peak+1, arr.length-1);

    }
    static int findpeak(int[] arr){
        int end = arr.length-1;
        int start =0;
        while (start<end){
            int mid = start + (end - start)/2;
            if (arr[mid]>arr[mid+1]){
                end = mid;
            } else {
                start = mid +1;
            }
        }
        return end;
    }

    static int binary(int[] arr, int target, int start, int end){
        boolean isasc= arr[start]<arr[end];
        while (start<=end){
            int mid = start + (end - start)/2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isasc){
                if (target>arr[mid]){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            } else {
                if (target<arr[mid]){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
