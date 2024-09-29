package Kunal_kushwaha.Binary_search;

public class OrderAgnosticSearch {
    public static void main(String[] args) {
        int[] descendingArray = {50, 40, 30, 25, 20, 15, 10, 5, 3, 1};
        int[] ascendingArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        System.out.println(search(ascendingArray, 10));
        System.out.println(search(descendingArray, 5));
    }
    static int search(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        boolean isAscending = arr[end]>arr[start];
        while(start<=end){
            int mid = start + (end-start)/2;
            if (target == arr[mid]) {
                return mid;
            } if (isAscending) {
                if (target>arr[mid]){
                    start = mid+1;
                } else{
                    end = mid -1;
                }
            } else {
                if (target<arr[mid]){
                    start = mid+1;
                } else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
