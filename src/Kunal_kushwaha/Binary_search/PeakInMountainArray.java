package Kunal_kushwaha.Binary_search;

public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] mountainArray = {1, 3, 5, 7, 6, 4, 2};
        System.out.println(FindPeak(mountainArray));
    }
    static int FindPeak(int[] arr){
        int start = 0;
        int end = arr.length;
        while (start<end){
            int mid = start + (end - start)/2;
//          check for the decreasing part
            if (arr[mid]>arr[mid+1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
