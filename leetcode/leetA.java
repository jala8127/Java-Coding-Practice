package leetcode;
import java.util.*;
public class leetA{
   public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     String input = sc.nextLine();
     String[] arr=input.split(" ");
     for(int i=arr.length-1;i>=0;i--){
       System.out.print(arr[i]+" ");
     }
   }  
}
