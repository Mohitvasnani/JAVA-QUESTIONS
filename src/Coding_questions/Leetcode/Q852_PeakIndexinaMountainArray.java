package Coding_questions.Leetcode;

public class Q852_PeakIndexinaMountainArray {
    public static void main(String[] args) {
        int[] mountainArray = {1, 3, 5, 7,8, 6, 4, 2};
        System.out.println(FindPeak(mountainArray));
    }
    static int FindPeak(int[] arr){
        int end = arr.length-1;
        int start = 0;
        while (start<end){
            int mid = start + (end - start)/2;
            if (arr[mid]> arr[mid+1]){
                end = mid;
            } else {
                start = mid +1;
            }
        }
        return end;
    }

}
