package FlowOfProgram;

// import java.util.Scanner;

// public class SumAll {
//     public static void main(String[] args) {
//         int num, sum;
//         Scanner input = new Scanner(System.in);
//         System.out.println("Keep entering numbers until you want, enter 'x' to stop.");
//         num = 0;
//         sum = 0;
//         String x = "0";
//         while (num != 'x') {
//             num = (int)(x);
//             sum = sum + num;
//             x = input.next();
//         }
//         System.out.println("Sum is "+sum);
//     }
    
// }
import java.util.Scanner;

public class SumAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers (enter 'x' to finish):");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                sum += num;
            } else if (scanner.next().equalsIgnoreCase("x")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a number or 'x' to finish.");
            }
        }

        System.out.println("Sum of the entered numbers: " + sum);
        scanner.close();
    }
}
