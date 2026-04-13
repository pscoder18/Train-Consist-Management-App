import java.util.LinkedList;

public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        LinkedList<String> trainConsist = new LinkedList<>();

        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("Cargo");

        System.out.println("Initial Consist: " + trainConsist);

        trainConsist.addFirst("Engine");
        trainConsist.addLast("Guard Coach");
        System.out.println("After adding Engine and Guard: " + trainConsist);

        trainConsist.add(2, "Pantry Car");
        System.out.println("After inserting Pantry Car at position 2: " + trainConsist);

        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("After detaching Engine and Guard (First & Last): " + trainConsist);

        System.out.println("\nFinal Ordered Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println("-> " + bogie);
        }
    }
}