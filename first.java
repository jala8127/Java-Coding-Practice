import java.util.*;
import java.lang.*;
public class first {
     public static void main (String args[]) {
          Scanner sc = new Scanner(System.in);
          int p = sc.nextInt();
          int n = sc.nextInt();

          int arr [] = new int[n];
          for (int i = 0 ;i<n;i++) {
               arr[i] = sc.nextInt();
               if (arr[i] == Math.sqrt() || arr[i] == Math.cbrt){
                    System.out.println(arr[i]);
               }else{
                    System.out.print("null");
                    }
               }
          // second test case
          int x = sc.nextInt();
          int arr2 [] = new int[n];
          for (int i = 0 ;i<n;i++) {
               arr[i] = sc.nextInt();
               if (arr[i] == Math.perfectsquare || arr[i] == Math.perfectcube){
                    System.out.println(arr2[i]);
          }else {
               System.out.print("null");}
          }
     }
}