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

        try (Scanner fileScanner = new Scanner(new File("sightings.txt"))) {
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

            System.out.println("Updated species populations:");
            System.out.println(species);

            if (!species.isEmpty()) {
                String mostFrequentSpecies = null;
                String leastFrequentSpecies = null;
                int maxCount = Integer.MIN_VALUE;
                int minCount = Integer.MAX_VALUE;

                for (String name : species.keySet()) {
                    int count = species.get(name);

                    if (count > maxCount) {
                        maxCount = count;
                        mostFrequentSpecies = name;
                    }

                    if (count < minCount) {
                        minCount = count;
                        leastFrequentSpecies = name;
                    }
                }

                System.out.println("Most frequent species: "
                        + mostFrequentSpecies + " (" + maxCount + ")");
                System.out.println("Least frequent species: "
                        + leastFrequentSpecies + " (" + minCount + ")");
            } else {
                System.out.println("No species were found in the registry.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Could not find sightings.txt.");
        }
    }
}
