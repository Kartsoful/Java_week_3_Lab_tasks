import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        // Tehtävä 1
        
        Scanner s = new Scanner(System.in);
        System.out.println("Anna nimiä. 'stop' lopettaa");

        List<String> Nimet = new ArrayList<>();

        while (true) {
            String nimi = s.nextLine();

            if (nimi.equals("stop")) {
                break;
            }

            Nimet.add(nimi);
        }

        System.out.println("Listalla seuraavat nimet:");
        for (String n : Nimet) {
            System.out.println(n);
        }
        

        // Tehtävä 2
        
        Scanner s2 = new Scanner(System.in);
        Set<String> sanat = new HashSet<>();

        System.out.println("Syötä sanoja. _stop_ lopettaa");
        System.out.println("Duplikaatit ei sallittuja");
        while (true) {
            String sana = s2.nextLine();

            if (sana.equals("stop")) {
                break;
            }
            sanat.add(sana);
        }

        System.out.println("Listalla olevat sanat:");

        for (String sana : sanat) {
            System.out.println(sana);
        }
        


        // Tehtävä 3
        
        Scanner s3 = new Scanner(System.in);
        Map<String,String> m = new HashMap<>();

        m.put("Anna", "+3581561561");
        m.put("Teppo", "+3581234565");
        m.put("Tatu", "+3582347566");

        System.out.println("Anna nimi:");
            String nimi2 = s3.nextLine();

        if (m.containsKey(nimi2)) {
            System.out.println(nimi2 + " Löytyi listalta");
            System.out.println("Puhelinnumero: " + m.get(nimi2));
        } else {
            System.out.println("Nimeä ei löytynyt listalta");
        }
        

        // Tehtävä 4
        Scanner s4 = new Scanner(System.in);
        System.out.println("Anna lause");
        String lause = s4.nextLine();

        Map<String,Integer> m2 = new HashMap<>();

        String[] words = lause.split(" ");

        for (String word : words) {

            if (m2.containsKey(word)) {
                int maara = m2.get(word) + 1;
                m2.put(word,maara);
            } else {
                m2.put(word,1);
            }
        }

        for (Map.Entry<String,Integer> entry : m2.entrySet()) {
            System.out.println("Sana: '" + entry.getKey() + "'. Esiintymät: " + entry.getValue());
        }
    }
}
