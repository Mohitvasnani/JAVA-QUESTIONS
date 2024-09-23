package practice.recurssion;

public class Recursion_print {
    public static void main(String[] args) {
        int n=1;
        if ( n == 0) {
            return;
        }
        printNumbers(n + 1);
        System.out.println(n);
    }

    public static void printNumbers(int n) {
        if (n >5) {
            return;
        }
        printNumbers(n + 1);
        System.out.println(n);
    }

}
