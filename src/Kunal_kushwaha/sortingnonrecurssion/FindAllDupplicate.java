package Kunal_kushwaha.sortingnonrecurssion;
import static Kunal_kushwaha.sortingnonrecurssion.Swap.swap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDupplicate {
    public static void main(String[] args) {
        int[] arr = {2,1,1,7,6,8,9,3,5,6,4,5,1};
        List<Integer> ans = find(arr);
        System.out.println(ans);

    }
    static List<Integer> find(int[] nums){
        List<Integer> ans = new ArrayList<>();
        int i =0;
        while (i< nums.length){
            int correct = nums[i]-1;
            if (nums[i]!=nums[correct]){
                swap(nums,i,correct);
            } else {
                i++;
            }

        }
        for (int j = 0; j < nums.length ; j++) {
            if (j+1!=nums[j]){
                ans.add(nums[j] );
            }
        }
        return ans;
    }
}
