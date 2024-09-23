package Kunal_kushwaha.Method_functions;

import java.util.Scanner;

public class Prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println(prime(n));
    }

    static boolean prime(int n){
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c*c<=n ){
            if ( n%c== 0) {
                return false;
            }     
            c++;
        }
        boolean b = c * c > n;
        return b;
        
    }
}
