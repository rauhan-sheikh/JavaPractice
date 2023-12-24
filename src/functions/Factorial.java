package functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer that you want to the factorial of: ");
        int n = in.nextInt();
        in.close();

        int factorial = factorial(n);
        System.out.println("The factorial is "+factorial);
    }

    static int factorial(int n) {
        if (n==1) {
            return 1;
        }
        else {
         return n * factorial(n-1);
        }
    }
}
