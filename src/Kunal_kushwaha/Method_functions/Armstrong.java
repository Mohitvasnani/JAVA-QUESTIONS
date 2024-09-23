package Kunal_kushwaha.Method_functions;
import java.util.Scanner;
import static Coding_questions.codingninja.Armstrongnumber.arm;



public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 100; i <1000 ; i++) {
            if (i == arm(i)) {
                System.out.println("all the values " + i);
            }
        }
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println(n== arm(n));





    }

}
