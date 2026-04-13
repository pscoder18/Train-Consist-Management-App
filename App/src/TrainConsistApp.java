import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // 1. Initialize the master list of bogies
        List<Bogie> passengerList = new ArrayList<>();
        passengerList.add(new Bogie("First Class", 24));
        passengerList.add(new Bogie("Sleeper", 72));
        passengerList.add(new Bogie("AC Chair", 56));
        passengerList.add(new Bogie("General", 90));
        passengerList.add(new Bogie("Executive", 30));

        System.out.println("Total bogies available: " + passengerList.size());

        // 2. Applying Stream API for filtering
        // Logic: Only select bogies with capacity > 60
        List<Bogie> highCapacityBogies = passengerList.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // 3. Display the Results
        System.out.println("\n--- High-Capacity Bogies (Capacity > 60) ---");
        if (highCapacityBogies.isEmpty()) {
            System.out.println("No bogies match the criteria.");
        } else {
            highCapacityBogies.forEach(System.out::println);
        }

        // 4. Verify Original Integrity
        System.out.println("\nVerification: Original list size remains " + passengerList.size());
    }
}