package Kunal_kushwaha.CycleSort;
import java.util.Arrays;

import static Kunal_kushwaha.Helper.Swap.swap;

public class Cyclesort {
    public static void main(String[] args) {
        int[] arr={5,4,3,1,2};
        System.out.println(Arrays.toString(cycle(arr)));
    }
    static int[] cycle(int[] arr){
        int i =0;
        while (i< arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        return arr;
    }

}
