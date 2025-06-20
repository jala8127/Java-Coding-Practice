import java.util.*;
public class fifteen {
     public static void main (String[]args) {
          Scanner sc = new Scanner(System.in);
          int arr[] = new int[6]; 
          for (int i=0;i<6;i++) {
               arr[i] = sc.nextInt();

          }
          for (int num : arr) {
               System.out.println(num);
          }
          String name = "jala";
          System.out.println(name);
          String str = "linga";
          name = str ;
          System.out.println(name);
     }
}

