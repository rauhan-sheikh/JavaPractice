package functions;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r = in.nextDouble();
        in.close();

        double crf = (Math.round(circumference(r)*100.0))/100.0;
        System.out.println("Circumference is "+crf);

        double ar = Math.round(area(r)*100)/100.0;
        System.out.println("Area of circle is "+ar);
    }

    static double area(double r) {
        double ar = Math.PI*r*r;
        return ar;
    }

    static double circumference(double r) {
        double crf = 2*Math.PI*r;
        return crf;
    }
    
}
