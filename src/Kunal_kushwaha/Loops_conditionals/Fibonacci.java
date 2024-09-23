package Kunal_kushwaha.Loops_conditionals;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println(fib(n));



    }

    static int fib(int n){
        int a = 0;
        int b = 1;
        int count = 2;
        int temp;
        while (count<=n){
            temp = a+b;
            a=b;
            b= temp;
            count++;
        }
        return b;
    }
}
