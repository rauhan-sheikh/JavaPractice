package functions;

import java.util.ArrayList;
import java.util.Scanner;

public class AllPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("You want to find primes between:");
        long num1 = in.nextInt();
        System.out.println("And ");
        long num2 = in.nextInt();
        in.close();
        allPrime(num1,num2);
    }

    static void allPrime(long num1, long num2) {
        ArrayList<Long> arr = new ArrayList<>();
        for (long i=num1;i<=num2;i++) {
            if (isPrimeO(i)) {
                arr.add(i);
            }
        }
        System.out.println(arr);
    }

    static boolean isPrimeO(long n) {
        if (n<=1) return false;
        if (n==2 || n==3) return true;
        if (n%2==0 || n%3==0) return false;

        for (int i=5;i*i<=n;i=i+6) {
            if (n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
}
