package FirstJava;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Number:");
        int num1 = input.nextInt();
        System.out.println("Enter second Number: ");
        int num2 = input.nextInt();

        if (num1>num2) {
            System.out.println(num1+" is the largest number.");
        } else if (num1<num2) {
            System.out.println(num2+" is the largest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }
        input.close();
    }
    
}
