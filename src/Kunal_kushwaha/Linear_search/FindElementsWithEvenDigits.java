package Kunal_kushwaha.Linear_search;

public class FindElementsWithEvenDigits {
    public static void main(String[] args) {
        int[] nums = {22,222,2222,2,123,2,345,2,567,56};
        System.out.println(Even_count(nums));

    }
    static int Even_count(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (isEven(arr[i])){
                count++;
            }
        }
        return count;
    }
    static boolean isEven(int num){
        int count = digitCount(num);
        return count%2==0;
    }
    static int digitCount(int num){
        int count = 0;
        while(num>0){
            int rem = num%10;
            num = num/10;
            count++;
        }
        return count;

    }


}
