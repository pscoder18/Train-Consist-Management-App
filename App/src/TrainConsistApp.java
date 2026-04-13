import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 1. Initialize LinkedHashSet to maintain unique bogies in order
        Set<String> trainFormation = new LinkedHashSet<>();

        // 2. Attach bogies in physical sequence
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        System.out.println("Initial Train Formation (Order Preserved):");
        System.out.println(trainFormation);

        // 3. Attempt to attach a duplicate bogie
        System.out.println("\nAttempting to re-attach 'Sleeper' bogie...");
        boolean isAdded = trainFormation.add("Sleeper");

        if (!isAdded) {
            System.out.println("System Alert: Duplicate bogie detected. Attachment rejected.");
        }

        // 4. Final Verification
        System.out.println("\nFinal Verified Train Consist:");
        int position = 1;
        for (String bogie : trainFormation) {
            System.out.println("Position " + position + ": " + bogie);
            position++;
        }
    }
}