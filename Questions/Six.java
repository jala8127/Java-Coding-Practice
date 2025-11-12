import java.util.*;
public class Six {
     public static void main (String args[]) {
          Scanner sc = new Scanner(System.in);

          int a = sc.nextInt();
          int b = sc.nextInt();
          int c[][] = new int[a][b] ;
          for(int i = 0;i<a;i++){
               for(int j = 0;j<b;j++){
                    c[i][j] = sc.nextInt();
               }
          }
          /*for (int[]row:c) {
               System.out.println(Arrays.toString(row));
          }*/
          int sum = 0;
          if (b >= 2) {
               for (int i = 0; i < a; i++) {
                    sum += c[i][1];
               }
          }
          System.out.println(sum);
     }
}