import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Custom class to represent a Bogie as an Object
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

        // 1. Create a List of Custom Bogie Objects
        List<Bogie> passengerList = new ArrayList<>();
        passengerList.add(new Bogie("First Class", 24));
        passengerList.add(new Bogie("Sleeper", 72));
        passengerList.add(new Bogie("AC Chair", 56));
        passengerList.add(new Bogie("General", 90));

        System.out.println("Initial List: " + passengerList);

        // 2. Sorting logic using Comparator (Ascending Order)
        // Comparing by the 'capacity' field of the Bogie object
        passengerList.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\n--- Bogies Sorted by Capacity (Low to High) ---");
        for (Bogie b : passengerList) {
            System.out.println(">> " + b);
        }

        // 3. Sorting logic for High Capacity First (Descending Order)
        passengerList.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());

        System.out.println("\n--- Bogies Sorted by Capacity (High to Low) ---");
        passengerList.forEach(b -> System.out.println(">> " + b));
    }
}