package leetcode;

import java.util.Scanner;

public class Reverse {

    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            while (left < right && vowels.indexOf(arr[left]) == -1) {
                left++;
            }
            while (left < right && vowels.indexOf(arr[right]) == -1) {
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = reverseVowels(input);

        System.out.println("Reversed Vowel String: " + result);

        sc.close();
    }
}