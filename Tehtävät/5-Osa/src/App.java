import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        // Tehtävä 1
        List<String> s1 = new ArrayList<>();
        s1.add("c");
        s1.add("a");
        s1.add("b");
        

        s1.sort(null);

        for (String x : s1 ){
            System.out.println(x);
        }

        // Tehtävä 2
        List<String> s2 = new ArrayList<>();
        s2.add("Ensimmäinen");
        s2.add("Nel");
        s2.add("Kolma");
        s2.add("Toinen");
        

        s2.sort(Comparator.comparingInt(s -> s.length()));

        for (String sana : s2) {
            System.out.println(sana);
        }

        // Tehtävä 3
        TreeMap<Integer,String> tm = new TreeMap<>();

        tm.put(3, "Kolme");
        tm.put(1, "Yksi");
        tm.put(2, "Kaksi");
        tm.put(5, "Viisi");
        tm.put(4, "Neljä");
        
        for(Map.Entry<Integer,String> entry : tm.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ". Aarvo: " + entry.getValue());
        }
    }
}
