import java.util.*;
public class Seven {
     public static void main (String args[]) {
          Scanner sc = new Scanner (System.in);
          String a = sc.nextLine();
          String b = sc.nextLine();
          if (a.equalsIgnoreCase(b)) {
               System.out.print("Strings are equal");
          }
          else {
               System.out.print("Strings are not equal");
          }
     }
}