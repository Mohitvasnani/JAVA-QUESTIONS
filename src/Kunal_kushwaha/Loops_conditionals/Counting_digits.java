package Kunal_kushwaha.Loops_conditionals;

import java.util.Scanner;

public class Counting_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        System.out.println("enter the target");
        int target = sc.nextInt();
        repeating_digits(a, target );

    }
    static void repeating_digits(int n, int target){
        int count = 0;
        int digits = 0;
        while (n>0){
            int rem = n%10;
            if (rem == target) {
                count++;
            }
            n = n / 10;
            digits++;
        }
        System.out.println(count);
        System.out.println(digits);

    }
}
