import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        // Tehtävä 1
        Set<String> s = new HashSet<>();
        s.add("Aurinko");
        s.add("Kuu");

        for(String x: s) {
            System.out.println(x);
        }

        // Tehtävä 2
        Set<Integer> s2 = new HashSet<>();
        s2.add(4);
        s2.add(4);

        for(int i : s2) {
            System.out.println(i);
        }

        // Tehtävä 3
        Set<Integer> s3 = new TreeSet<>();
        s3.add(3);
        s3.add(1);
        s3.add(2);

        for (int i : s3) {
            System.out.println(i);
        }
    }
}
