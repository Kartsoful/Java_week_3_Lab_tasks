import java.util.Map;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        // Tehtävä 1
        Map<String,Integer> m = new HashMap<>();
        m.put("A",1);
        m.put("B", 2);

        System.out.println(m.get("A"));

        // Tehtävä 2
        Map<String, Integer> m2 = new HashMap<>();
        m2.put("A",1);
        m2.put("B", 2);
        m2.put("C",3);
        
        for (Map.Entry<String, Integer> entry : m2.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        // Tehtävä 3
        Map<Integer, String> m3 = new HashMap<>();
        m3.put(1,"Punainen");
        m3.put(2,"Sininen");

        for (Map.Entry<Integer, String> entry : m3.entrySet()) {
            System.out.print(entry.getKey() + " ");
        }

    }
}
