package Kunal_kushwaha.Linear_search;

public class FindMinMax {
    public static void main(String[] args) {
        int[] nums = {2,4,6,1,11,19,7,3,5,29};
        System.out.println("min "+ Mini(nums));
        System.out.println("max "+ Maxi(nums));


    }
    static int Mini(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length ; i++) {
           if (arr[i]<min){
               min= arr[i];
           }
        }
        return min;
    }

    static int Maxi(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }
}
