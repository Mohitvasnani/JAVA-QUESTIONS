package Kunal_kushwaha.sortingnonrecurssion;
import static Kunal_kushwaha.sortingnonrecurssion.Swap.swap;

import java.util.ArrayList;
import java.util.List;

public class FindAllDupplicate {
    public static void main(String[] args) {

    }
    static List<Integer> find(int[] nums){
        List<Integer> ans = new ArrayList<>();
        int i =0;
        while (i< nums.length){
            if (nums[i]!=i+1){
                int correct = nums[i]-1;
                if (nums[i]!=nums[correct]){
                    swap(nums,i,correct);
                }
            } else {
                i++;
            }
        }
        return ans;
    }
}
