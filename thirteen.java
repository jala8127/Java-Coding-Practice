import java.util.*;
class BankAccount {
     private int accountNumber;
     private int balance;

     public int getAccountNumber() {
          return accountNumber ;
     }
     public void setAccountNumber(int accountNumber) {
          this.accountNumber = accountNumber ;
     }

     public int getBalance() {
          return balance ;
     }
     public void setBalance(int balance) {
          this.balance = balance ;
     }
}
public class thirteen {
     public static void main (String args[]) {
          BankAccount BankAccount = new BankAccount() ;

          BankAccount.setAccountNumber(1234567890);
          BankAccount.setBalance(6000);

          int accountNumber = BankAccount.getAccountNumber();
          int balance = BankAccount.getBalance();
          
          System.out.println(accountNumber);
          System.out.println(balance);
     }
}
