package Kunal_kushwaha.Binary_search;

public class PositionInInfiniteSortedArray {
    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39};
        System.out.println(findrange(sortedArray,33 ));
    }
    static int findrange(int[] arr, int target){
        int start=0;
        int end =1;
        while(target>arr[end]){
            int newstart = end +1;
            end = end +(end-start+1) *2;
            start=newstart;
        }
        return binary(arr, target, start, end);
    }
    static int binary(int[] arr, int target, int start, int end){
        while (start<=end){
            int mid = start +(end-start)/2;
            if (target==arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return  -1;
    }
}
