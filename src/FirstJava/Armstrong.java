// package FirstJava;

// import java.util.Scanner;

// public class Armstrong {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         String num = input.next();

//         int i =0;
//         double num1=0,sum=0;
//         while (i<num.length()) {
//             num1 = (int)(num.charAt(i));
//             sum += Math.pow(num1, sum);
//         }
//         double num = (double)(num);

//         if (num==sum) {
//             System.out.println("this is an Armstrong number.");
//         } else {
//             System.out.println("This NOT an Armstrong number.");
//         }
//         input.close();
//     }
    
// }
package FirstJava;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        input.close();

        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = num;

        // Count digits
        for (; originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = num;

        // Calculate Armstrong number
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        if (result == num) {
            System.out.println("This is an Armstrong number.");
        } else {
            System.out.println("This is NOT an Armstrong number.");
        }
    }
}
