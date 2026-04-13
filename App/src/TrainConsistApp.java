import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger bogies added: " + passengerBogies);
        System.out.println("Current Bogie Count: " + passengerBogies.size());

        passengerBogies.remove("AC Chair");
        System.out.println("\nAfter removing AC Chair: " + passengerBogies);

        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Is 'Sleeper' bogie attached? " + hasSleeper);

        System.out.println("\nFinal Train Consist Summary:");
        System.out.println("Total Bogies: " + passengerBogies.size());
        System.out.println("Bogies List: " + passengerBogies);
    }
}