package FlowOfProgram;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = input.nextInt();
        System.out.println("Leap Year: " + leapYear(year));
        input.close();

    }
    public static boolean leapYear(int y){
        boolean flag = true;
        if (y%4==0) {
            if (y%100==0) {
                if (y%400==0) {
                    return flag;
                } else {
                    flag = false;
                    return flag;
                }
            } else {
                return flag;
            }
        } else {
            flag = false;
            return flag;
        }
    }
}
