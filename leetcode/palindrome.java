package leetcode;

import java.util.Scanner;

public class palindrome {

    public static boolean isPalindrome(String s) {
        
        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String input = sc.nextLine();

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("The phrase is a palindrome.");
        } else {
            System.out.println("The phrase is NOT a palindrome.");
        }

        sc.close();
    }
}