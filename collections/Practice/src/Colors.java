import java.util.*;

import static java.lang.System.*;

public class Colors {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("white") ;
        str.add("yellow") ;
        str.add("green") ;
        str.add("purple");
        str.add("orange");
        str.add("black");
        str.add("red");
        str.add("blue");
        str.add("gold");
        str.add("grey");
        out.println(str);

        str.addFirst("lavender");
        str.add(2,"pink");
        System.out.println(str.get(5));
        str.set(8,"violet");
        str.remove(9);

        if (str.contains("gold")){
             System.out.println( "element found" );
        }else {
            System.out.println("not found");
        }

        int count = 0;
        for (String elements:str) {
            count++;
            out.println(count+" "+elements+"="+ (count-1));
        }
        Collections.sort(str);
        System.out.println(str);
    }
}
