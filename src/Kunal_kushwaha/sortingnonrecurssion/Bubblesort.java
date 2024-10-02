package Kunal_kushwaha.sortingnonrecurssion;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr ={5,4,3,1,2};
        System.out.println(Arrays.toString(bubble(arr)));
    }
    static int[] bubble(int[] arr){
        boolean isswap = false;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j < arr.length ; j++) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    isswap = true;
                }
            }
            if (!isswap){
                break;
            }
        }
        return arr;
    }
}
