package Kunal_kushwaha.Helper;

public class Swap {
    public static int[] swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]= temp;
        return arr;
    }
}
