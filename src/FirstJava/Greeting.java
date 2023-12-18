package FirstJava;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String name = input.next();
        System.out.println("Hello and Welcome! "+name);
        input.close();
    }
    
}
