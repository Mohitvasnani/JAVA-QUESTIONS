package Kunal_kushwaha.arrays_and_arrayList;

public class Swap_Func {
    public static int[] swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        return arr;
    }
}

