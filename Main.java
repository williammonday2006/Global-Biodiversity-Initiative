import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> species = new HashMap<>();

        species.put("Wolf", 25);
        species.put("Deer", 120);
        species.put("Fox", 18);
        species.put("Rabbit", 75);
        species.put("Bear", 12);

        try {
            Scanner fileScanner = new Scanner(new File("sightings.txt"));

            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine().trim();

                if (name.isEmpty()) {
                    continue;
                }

                if (species.containsKey(name)) {
                    species.put(name, species.get(name) + 1);
                } else {
                    species.put(name, 1);
                }
            }

            fileScanner.close();

            System.out.println("Updated species populations:");
            System.out.println(species);
        } catch (FileNotFoundException e) {
            System.out.println("Could not find sightings.txt.");
        }
    }
}
