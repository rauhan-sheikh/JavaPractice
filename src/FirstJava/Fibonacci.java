package FirstJava;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int num1=1, num2=1, temp=0;
        int n = input.nextInt();
        while (i<=n) {
            if (i==1) {
                System.out.print(num1+" ");
            } else if (i==2) {
                System.out.print(num2+" ");
            } else {
                temp = num2;
                num2 = num1+num2;
                num1 = temp;
                System.out.print(num2+" ");
            }
            i++;

        }
        input.close();
    }
    
}
