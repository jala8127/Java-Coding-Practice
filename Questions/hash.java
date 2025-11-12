import java.util.HashSet;

public class hash {
     public static void main (String args[]) {

     HashSet<String> colour = new HashSet<String>();
          colour.add("Red");
          colour.add("black");
          colour.add("green");
          colour.add("pink");
          colour.add("white");
          colour.add("orange");
          colour.add("blue");
          colour.add("yellow");


     System.out.println("The Hash Set:" + colour);
     System.out.println("The Hash Set size =:" + colour.size());
     String newArr [] = new String[colour.size()]
     colour.toArray(newArr[]);
     System.out.println("The Array:" + newArr[]);

     }
}