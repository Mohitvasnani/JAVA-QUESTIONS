package Coding_questions.Geeks_for_Geeks;

import java.util.ArrayList;

public class ArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = {0, 3, 1, 2, 3, 5, 6, 5, 2};
        System.out.println(finddup(arr));

    }
    static ArrayList<Integer> finddup(int[] arr){
        ArrayList<Integer> result =  new ArrayList<>();
        int[] freq = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < freq.length ; i++) {
            if (freq[i]>1){
                result.add(i);
            }
        }
        if (result.isEmpty()){
            result.add(-1);
        }
        return result;
    }
}
