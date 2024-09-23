package Kunal_kushwaha.arrays_and_arrayList;

import java.util.Arrays;

import static Kunal_kushwaha.arrays_and_arrayList.Swap_Func.swap;

public class Reverse_array {
    public static void main(String[] args) {
        int[] arr = {3,4,2,14,11,2,9};
        String str = Arrays.toString(rev(arr));
        System.out.println(str);
    }

    public static int[] rev(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (end>start){
            swap(arr, start, end);
            start++;
            end--;
        }
        return arr;
    }
}
