package functions;

import java.util.Arrays;
import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i=0;i<3;i++) {
            System.out.println("Enter number "+(i+1)+": ");
            arr[i] = in.nextInt();
        }
        in.close();
        System.out.println("isPythagoreanTriplet: "+isPythagoreanTriplet(arr));
    }

    static boolean isPythagoreanTriplet(int[] arr) {
        Arrays.sort(arr);
        if ((Math.pow(arr[0], 2)+Math.pow(arr[1], 2))==Math.pow(arr[2], 2)) {
            return true;
        } else return false;
    }
}
