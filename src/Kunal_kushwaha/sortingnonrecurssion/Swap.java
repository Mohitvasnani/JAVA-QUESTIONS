package Kunal_kushwaha.sortingnonrecurssion;

public class Swap {
    public static int[] swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]= temp;
        return arr;
    }
}
