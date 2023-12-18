package FirstJava;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Enter the operator(+,-,*,/): ");
        String op = input.next();

        if (op.equals("+")) {
            System.out.println("Result: "+(num1+num2));
        } else if (op.equals("-")) {
            System.out.println("Result: "+(num1-num2));
        } else if (op.equals("*")) {
            System.out.println("Result: "+(num1*num2));
        } else if (op.equals("/")) {
            System.out.println("Result: "+(num1/num2));
        } else {
            System.out.println("Invalid input!");
        }
        input.close();
    }
    
}
