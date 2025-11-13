package leetcode;

import java.util.*;

public class reverse_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        s = s.trim();

        String[] words = s.split("\\s+");

        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }

        System.out.println("Reversed sentence: " + sb.toString());
        sc.close();
    }
}