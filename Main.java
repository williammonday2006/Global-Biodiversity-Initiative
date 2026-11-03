import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> species = new HashMap<>();

        species.put("Wolf", 25);
        species.put("Deer", 120);
        species.put("Fox", 18);
        species.put("Rabbit", 75);
        species.put("Bear", 12);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a species name to check its population: ");
        String name = scanner.nextLine().trim();

        if (species.containsKey(name)) {
            System.out.println(name + " population: " + species.get(name));
        } else {
            System.out.println(name + " is not currently in the registry.");
        }

        scanner.close();
    }
}
