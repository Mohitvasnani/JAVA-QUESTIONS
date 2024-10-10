package Kunal_kushwaha.CycleSort;

import static Kunal_kushwaha.Helper.Swap.swap;
public class FindingmissingNo {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(find(arr));

    }
    static int find(int[] arr){
        int i = 0;
        while (i< arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct );
            } else {
                i++;
            }
        }
        for (int j = 0; j <arr.length ; j++) {
            if (arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }
}
