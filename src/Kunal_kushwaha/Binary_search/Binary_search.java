package Kunal_kushwaha.Binary_search;

import java.util.Arrays;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9,20 ,21,18};
        System.out.println(search(arr, 100));

    }
    static int search(int[] arr, int target){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (target>arr[mid]) {
                start = mid +1;
            } else if (target<arr[mid]) {
                end = mid-1;
            } else if (target==arr[mid]){
                return mid;
            }
        }
        return -1;
    }
}
