import java.util.*;
public class Nine {
     public static void main (String args[]) {
          Scanner sc = new Scanner (System.in);
          int n = sc.nextInt();
          int a[] = new int[n];
          for (int i = 0;i<n;i++) {
               a[i] = sc.nextInt() ;
          }
          ArrayList<Integer> duplicate=new ArrayList<>();
          for (int i = 0;i<n;i++) {
               ArrayList<Integer> found=new ArrayList<>();
               for (int j = i+1;j<n;j++) {
                    if (a[i] == a[j]) {
                         found.add(a[i]);
                    }
               }
               if (found.size() > 0 && !duplicate.contains(a[i])) {
                    duplicate.add(a[i]);
               }
          }
          ArrayList<Integer> missing=new ArrayList<>();
          for (int i  = 1;i<=n;i++) {
               ArrayList<Integer> count=new ArrayList<>();
               for (int j = 0; j < n; j++) {
                    if (a[j] == i ) {
                         count.add(i);
                    }
               }
               if (count.size() == 0) {
                    missing.add(i);
               }
          }
          System.out.println("Duplicate : " + duplicate);
          System.out.println("Missing : " + missing);
     }
}