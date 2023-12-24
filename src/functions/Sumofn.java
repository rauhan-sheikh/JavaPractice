package functions;

import java.util.Scanner;
// Sum of n natural numbers
public class Sumofn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = in.nextInt();
        in.close();
        System.out.println("Sum of n natural numbers: "+sumofn(n));
    }

    static int sumofn(int n) {
        int sn = n*(n+1)/2;
        return sn;
    }
}
