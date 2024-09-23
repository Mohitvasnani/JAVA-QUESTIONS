package Coding_questions.codingninja;

public class Count_digits {
    public static int countDigits(int n){
        int count = 0;
        int org = n;
        while(n>0){
            int digit = n%10;
            if (org%digit== 0) {
                count++;
            }
            n = n/10;

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(660));
    }
}
