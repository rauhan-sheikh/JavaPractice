package FlowOfProgram;

import java.util.Scanner;

public class LcmHcf {
    public static void main(String[] args) {
        int num1, num2, temp1, temp2, temp, lcm, hcf;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = input.nextInt();
        System.out.println("Enter Second number: ");
        num2 = input.nextInt();
        input.close();
        
        temp1 = num1;
        temp2 = num2;

        while (temp2 != 0) {
            temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
        }
        hcf = temp1;
        lcm = (num1*num2)/hcf;

        System.out.println("Hcf is "+hcf);
        System.out.println("Lcm is "+lcm);
    }
    
}
