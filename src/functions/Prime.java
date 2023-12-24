package functions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n = in.nextLong();        
        in.close();

        long startTime = System.nanoTime();
        System.out.println(isPrime(n));
        long endTime = System.nanoTime();
        long duration = endTime-startTime;
        long seconds = (long) (duration);
        System.out.println("for isPrime it took: "+seconds);


        startTime = System.nanoTime();
        System.out.println(isPrimeO(n));
        endTime = System.nanoTime();
        duration = endTime-startTime;
        seconds = (long) (duration);
        System.out.println("for isPrimeO it took: "+seconds);
    }

    static boolean isPrime(long n) {
        int i=2;
        if (n<2) {
            System.out.println("Invalid number! Enter an integer greater than 2.");
            return false;
        } else if (n==2) {
            return true;
        } else {
            while(i*i<=n) {
                if (n%i==0) {
                    return false;
                }
                i++;
            }
        }
        return true;
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
