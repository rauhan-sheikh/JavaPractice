package FlowOfProgram;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for multiplication table: ");
        int num = input.nextInt();

        for (int i = 1; i<=10; i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
        input.close();

    }
}
