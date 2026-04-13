import java.util.HashMap;
import java.util.Map;

public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 1. Initialize HashMap (Key: Bogie Name, Value: Capacity)
        Map<String, Integer> bogieCapacities = new HashMap<>();

        // 2. Map bogies to their respective capacities (Put operations)
        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 56);
        bogieCapacities.put("First Class", 24);
        bogieCapacities.put("General", 90);

        System.out.println("Bogie-Capacity mapping initialized.\n");

        // 3. Iterate through the Map using entrySet()
        System.out.println("--- Current Bogie Capacity Details ---");
        for (Map.Entry<String, Integer> entry : bogieCapacities.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Capacity: " + entry.getValue() + " seats");
        }

        // 4. Fast Lookup Example
        String searchBogie = "AC Chair";
        if (bogieCapacities.containsKey(searchBogie)) {
            System.out.println("\nQuick Search: The " + searchBogie + " has a capacity of " + bogieCapacities.get(searchBogie) + " seats.");
        }
    }
}