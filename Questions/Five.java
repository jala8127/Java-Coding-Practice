import java.util.*;
public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        ArrayList<List<Object>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String first = sc.next(); 
            if (first.equals("0")) {
                sc.next(); 
                arr.add(new ArrayList<>()); 
            } else {
                int number = Integer.parseInt(first);
                String text = sc.next();
                List<Object> pair = new ArrayList<>();
                pair.add(number);
                pair.add(text);
                arr.add(pair);
            }
        }
        List<String> messages = new ArrayList<>();
        List<Integer> times = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            List<Object> entry = arr.get(i);
            
            if (entry.size() == 0) {
                continue; 
            }

            int timestamp = (int) entry.get(0);
            String message = (String) entry.get(1);

            boolean shouldPrint = true;

            for (int j = 0; j < messages.size(); j++) {
                if (messages.get(j).equals(message)) {
                    if (timestamp < times.get(j)) {
                        shouldPrint = false;
                        break;
                    }
                }
            }

            System.out.println(shouldPrint);

            if (shouldPrint) {
                boolean found = false;
                for (int j = 0; j < messages.size(); j++) {
                    if (messages.get(j).equals(message)) {
                        times.set(j, timestamp + 10);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    messages.add(message);
                    times.add(timestamp + 10);
                }
            }
        }
    }
}
