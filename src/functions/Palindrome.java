package functions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        in.close();
        System.out.println("isPalindrome: "+isPalindrome(num));
        System.out.print("isPalindrome2: "+isPalindrome(num));
    }

    public static boolean isPalindrome(int num) {
        String str = ""+num;
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        return true; // If the loop completes, it's a palindrome
    }

    static boolean isPalindrome2(int num) {
        int reverse = 0,temp=0,num2=num;
        while (num!=0) {
            temp = num2%10;
            reverse = reverse*10 + temp;
            num2 = num2/10;
        }
        if (num==num2) return true;
        else return false;
    }
}
