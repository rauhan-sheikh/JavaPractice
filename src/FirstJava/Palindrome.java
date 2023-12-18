package FirstJava;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();

        if (isPalindrome(str)) {
            System.out.println("The string '" + str + "' is a palindrome.");
        } else {
            System.out.println("The string '" + str + "' is not a palindrome.");
        }
        input.close();
    }

    public static boolean isPalindrome(String str) {
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
}

