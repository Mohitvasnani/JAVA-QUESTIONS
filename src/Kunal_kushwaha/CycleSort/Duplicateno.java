package Kunal_kushwaha.CycleSort;
import static Kunal_kushwaha.Helper.Swap.swap;
public class Duplicateno {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findduplicate(nums));
    }
    static int findduplicate(int[] nums){
        int i = 0;
        while(i< nums.length){
            if (nums[i]!= i+1){
                int correct = nums[i]-1;
                if (nums[i]!=nums[correct]){
                    swap(nums, i, correct );
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
}
