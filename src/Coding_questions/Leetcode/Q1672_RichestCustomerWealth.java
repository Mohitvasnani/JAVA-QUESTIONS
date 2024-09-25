package Coding_questions.Leetcode;

public class Q1672_RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] bank= {
                {1,2,4,5},
                {17,2,6,5},
                {10,2,4,5},
        };
        System.out.println(maximumWealth(bank));

    }
    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int person = 0; person < accounts.length ; person++) {
            int sum = 0;
            for (int account = 0; account <accounts[person].length ; account++) {
                sum = sum + accounts[person][account];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;

    }

}
