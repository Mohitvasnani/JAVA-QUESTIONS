package Coding_questions.codingninja;

public class Sum_of_all_divisors {
    public static void main(String[] args) {
        System.out.println(sumOfAllDivisors(8));
    }

    public static int sumOfAllDivisors(int n) {
        int totalSum = 0;

        // Loop over every number i from 1 to n
        for (int i = 1; i <= n; i++) {
            // Add i to the total sum for each multiple of i
            totalSum += (n / i) * i;
        }

        return totalSum;
    }
}
