package FirstJava;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter currency in rupees: ");
        double inr = input.nextFloat();
        double usd = inr/83;
        usd = Math.round(usd*100.0)/100.0;
        System.out.println(inr+" Rs in Dollars: "+usd);
        input.close();
    }
        
}
