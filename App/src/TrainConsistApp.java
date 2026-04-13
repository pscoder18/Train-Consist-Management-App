import java.util.HashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        System.out.println("Initial Bogie IDs added: " + bogieIds);

        System.out.println("\nAttempting to add duplicate ID: BG101...");
        boolean isAdded = bogieIds.add("BG101");

        if (!isAdded) {
            System.out.println("Constraint Violated: Duplicate Bogie ID 'BG101' rejected.");
        }

        System.out.println("\nFinal Unique Bogie IDs in System:");
        System.out.println(bogieIds);
        System.out.println("Total Unique Bogies: " + bogieIds.size());
    }
}