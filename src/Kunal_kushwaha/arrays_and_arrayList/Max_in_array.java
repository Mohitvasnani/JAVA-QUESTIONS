package Kunal_kushwaha.arrays_and_arrayList;

public class Max_in_array {
    public static void main(String[] args) {
        int[] arr = {3,4,2,14,11,2,9};
        System.out.println(FindMax(arr));

    }

    static int FindMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max=arr[i];
            }
        }
        return max;
    }
}
