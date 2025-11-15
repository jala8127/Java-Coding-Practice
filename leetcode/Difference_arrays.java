package leetcode;

import java.util.*;

public class Difference_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of nums1: ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter elements of nums1:");
        for (int i = 0; i < n1; i++) nums1[i] = sc.nextInt();

        System.out.print("Enter size of nums2: ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter elements of nums2:");
        for (int i = 0; i < n2; i++) nums2[i] = sc.nextInt();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int n : nums1) set1.add(n);
        for (int n : nums2) set2.add(n);

        List<Integer> diff1 = new ArrayList<>();
        List<Integer> diff2 = new ArrayList<>();

        for (int n : set1) {
            if (!set2.contains(n)) diff1.add(n);
        }
        for (int n : set2) {
            if (!set1.contains(n)) diff2.add(n);
        }

        System.out.println("Distinct in nums1 but not in nums2: " + diff1);
        System.out.println("Distinct in nums2 but not in nums1: " + diff2);

        sc.close();
    }
}