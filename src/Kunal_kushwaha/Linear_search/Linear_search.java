package Kunal_kushwaha.Linear_search;

public class Linear_search {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9,20 ,21,18};
        System.out.println(search_in_range(arr, 5, 8,4));

    }
    static int Linear(int[] nums,  int target){
        if (nums.length == 0) {
            return -1;
        }
        for (int i= 0; i<=nums.length; i++){
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
    static boolean search_in_range(int[] arr, int start, int end,int target){
        for (int i = start; i <=end ; i++) {
            if (arr[i]== target) {
                return true;
            }
        }
        return false;
    }
}
