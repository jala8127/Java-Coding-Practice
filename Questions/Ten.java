import java.util.*;
public class Ten {
    public static void main (String args[]) {
          Scanner sc = new Scanner (System.in);
          int count = sc.nextInt();
          ArrayList<Integer> Transactions = new ArrayList<>();
          int min = 100 ;
          int max = 10000 ;

          for (int i = 0; i < count; i++) {
               Transactions.add(sc.nextInt());
          }
          ArrayList<Integer> suspicious=new ArrayList<>();
          ArrayList<Integer> invalid=new ArrayList<>();
          for (int i = 0;i<Transactions.size();i++){
               int amount = Transactions.get(i) ;
               if(amount > max || amount < min) {
                    invalid.add(amount);
               }
          }
          for (int i = 0;i<Transactions.size();i++) {
               for (int j = i+1 ;j<Transactions.size();j++) {
                    if (Transactions.get(i).equals(Transactions.get(j))) {
                         if (!suspicious.contains(Transactions.get(i))) {
                             suspicious.add(Transactions.get(i));
                         }
                     }
               }
          }
          System.out.println("Invalid = "+ invalid);
          System.out.println("Suspicious = "+ suspicious);
    } 
}