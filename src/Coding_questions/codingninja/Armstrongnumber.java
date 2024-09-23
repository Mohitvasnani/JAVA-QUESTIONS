package Coding_questions.codingninja;
import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arm = arm(n);
        System.out.println(n == arm);

    }

   public static int arm(int num){
        int digit_count = Digit(num);
        int sum = 0;
        int org = num;

        while(num>0){
            int digit = num %10;
            sum = sum + (int)Math.pow(digit, digit_count);
            num=num/10;

        }
        return sum;


    }

    static int Digit(int x){
        int count = 0;
        int org = x;
        while(x>0){
            x= x/10;
            count ++;
        }
        return count;
    }
}
