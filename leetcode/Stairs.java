package leetcode;

import java.util.Scanner;

public class Stairs {

    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int a = 1; 
        int b = 2; 

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of steps: ");
        int n = sc.nextInt();

        int ways = climbStairs(n);
        System.out.println("Number of ways to climb " + n + " steps = " + ways);
        
        sc.close();
    }
}

