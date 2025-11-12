import java.util.*;

public class Three {
     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          int testCase = sc.nextInt();

          for (int l = 0; l < testCase; l++) {
               int size = sc.nextInt();
               int arr[] = new int[size];
               for (int i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
               }
               int count = 0;
               for (int i = 0; i < size; i++) {
                    for (int j = i + 1; j < size; j++) {
                        int sum = arr[i] + arr[j];
                        double sqrt = Math.sqrt(sum);
                        double cbrt = Math.cbrt(sum);
                    if (sqrt == Math.floor(sqrt) || cbrt == Math.floor(cbrt)) {
                        count++;
                    }
               }
          }

          System.out.println("Count: " + count);
          }
     }
}
