package Kunal_kushwaha.Binary_search;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr={4, 5, 6, 7, 1, 2, 3};
        System.out.println(rotatedSearch(arr,2));
    }
    static int rotatedSearch(int[] arr, int target){
        int pivot = findPivot(arr);
        if (pivot == target) return pivot;
        if (pivot==-1){
            return binarysearch(arr,target,0,arr.length-1);
        } else if (target>arr[0]) {
            return binarysearch(arr,target,0,pivot-1);
        } else if (target<arr[0]) {
            return binarysearch(arr,target,pivot+1,arr.length-1);
        }
        return -1;
    }
    static int binarysearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end - start)/2;
            if (arr[mid]==target) return mid;
            if (target>arr[mid]){
                start= mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while (s<=e){
            int m = s + (e-s)/2;
            if(arr[m]>arr[m+1]){
                return m;
            } else if (arr[m]<arr[m-1]) {
                return m;
            } else if (s>=m) {
                e=m-1;
            } else if(s<m){
                s = m+1;
            }
        }
        return  -1;
    }

}
