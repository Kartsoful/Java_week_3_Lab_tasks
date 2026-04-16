import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Tehtävä 1
        List<String> Stringlist = new ArrayList<>();
        Stringlist.add("Omena");

        // Tehtävä 2
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);

        // Tehtävä 3
        List<String> Animals = new ArrayList<>();
        Animals.add("Kissa");
        Animals.add("Koira");
        System.out.println(Animals.get(0)); // Tulostetaan "Kissa"

        // Tehtävä 4
        List<String> alphabet = new ArrayList<>();
        alphabet.add("A");
        alphabet.add("B");
        alphabet.add("C");
        alphabet.remove(1); // Poistetaan B

        // Tehtävä 5
        List<String> test = new ArrayList<>();
        test.add("x");
        test.add("y");
        test.add("z");
        test.add("xyz");
        System.out.println(test.size());  // Tulostetaan listan koko

        // Tehtävä 6
        List<Integer> numerot = new ArrayList<>();
        numerot.add(1);
        numerot.add(2);
        numerot.add(3);

        for (int n : numerot) {
            System.out.println(n); // Tulostetaan listan "Numerot" numerot järjestyksessä
        }
    }
}
