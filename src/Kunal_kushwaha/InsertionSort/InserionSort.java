package Kunal_kushwaha.InsertionSort;
import java.util.Arrays;

import static Kunal_kushwaha.Helper.Swap.swap;
public class InserionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println(Arrays.toString(insert(arr)));
    }
    static int[] insert(int[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                } else {
                    break;
                }
            }
        }
        return arr;
    }
}
