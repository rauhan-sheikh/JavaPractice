package functions;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        
        for (int i=0;i<3;i++) {
            System.out.println("Enter number "+(i+1)+": ");
            arr[i] = in.nextInt();
        }
        in.close();
        int smallest = min(arr);
        System.out.println("Min: "+smallest);

        int biggest = max(arr);
        System.out.println("Max: "+biggest);
        
    }   
    
    static int min(int[] arr) {
        int smallest=arr[0];
        for (int i=0; i<3; i++) {
            if (arr[i]<smallest) {
                smallest = arr[i];
            }
        }

        return smallest;
    }

    static int max(int[] arr) {
        int biggest=arr[0];
        for (int i=0; i<3; i++) {
            if (arr[i]>biggest) {
                biggest = arr[i];
            }
        }

        return biggest;
    }
}
