package Kunal_kushwaha.SelectionSort;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr ={5,4,3,1,2};
        System.out.println(Arrays.toString(selection(arr)));
    }
    static int[] selection(int[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            int min = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];

            arr[i] = temp;
        }
        return arr;
    }
}
