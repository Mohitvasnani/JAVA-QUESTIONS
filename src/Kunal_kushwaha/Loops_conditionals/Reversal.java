package Kunal_kushwaha.Loops_conditionals;

import java.util.Scanner;

public class Reversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        System.out.println(rev(a));
    }

    static int rev(int n){
        int org = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum*10 + rem;
            n= n/10;
        }
        return sum;
    }
}
