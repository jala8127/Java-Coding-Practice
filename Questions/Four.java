import java.util.*;
public class Four {
     public static void main (String args[]) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt(); // number of books
          int m = sc.nextInt(); // number of Students

          int a[] = new int[n];
          for (int i = 0; i<n;i++) {
               a[i] = sc.nextInt();
          }
          if (m > n) {
               System.out.println(-1);
               return;
          }
          int low = Arrays.stream(a).max().getAsInt();
          int high = Arrays.stream(a).sum();
          int answer = -1;
   
          while (low <= high) {
               int mid = (low + high) / 2;
               int student = 1;
               int sum = 0;
               int i = 0;
   
               while (i < n) {
                   if (sum + a[i] <= mid) {
                       sum += a[i];
                       i++;
                   } else {
                       student++;
                       sum = 0;
                   }
               }
   
               if (student <= m) {
                   answer = mid;
                   high = mid - 1;
               } else {
                   low = mid + 1;
               }
          }
   
           System.out.println(answer);
     }
}