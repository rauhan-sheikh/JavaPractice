package FirstJava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principle:");
        int p = input.nextInt();
        System.out.println("Enter Rate of Interest(%):");
        float r = input.nextFloat();
        System.out.println("Enter Time (years):");
        int t = input.nextInt();

        float si = (p*r*t)/100;

        System.out.println("Simple Interest: "+si);
        input.close();
    }
    
}
