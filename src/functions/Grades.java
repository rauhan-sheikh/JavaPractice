package functions;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = in.nextInt();
        in.close();

        String grade = grading(marks);
        System.out.println("The grade is "+grade+".");
    }

    static String grading(int marks) {
        if (marks > 90) {
            return "AA";
        } else if (marks > 80) {
            return "AB";
        } else if (marks > 70) {
            return "BB";
        } else if (marks > 60) {
            return "BC";
        } else if (marks > 50) {
            return "CD";
        } else if (marks > 40) {
            return "DD";
        } else {
            return "fail";
        }
    }
       
}
