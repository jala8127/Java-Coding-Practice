import java.util.*;
public class Eight {
     public static void main (String args[]) {
          Scanner sc = new Scanner (System.in);
          int count = sc.nextInt();
          List<Integer> invoices = new ArrayList<>() ;
          for (int i = 0; i < count; i++) {
               invoices.add(sc.nextInt());    
          }
          int max = Collections.max(invoices);

          for (int i = 1;i<=max;i++) {
               if (!invoices.contains(i)) {
                    System.out.print(i + " ");
                    
               }
          }
     }
}
