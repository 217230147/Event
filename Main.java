import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Map<String, Event> events = new HashMap<>();

                while (true) {
                    System.out.println("Please select an action:");
                    System.out.println("1. Create a new event");
                    System.out.println("2. Manage events");
                    System.out.println("3. Quit");
                    String option = scanner.nextLine();

                    
                    switch (option) {
                        case "1":
                            System.out.println("Please enter your eventID:");
                            String eventID = scanner.nextLine();
                            System.out.println("Please enter your eventName:");
                            String eventName = scanner.nextLine();
                            System.out.println("Please enter your eventVenue");
                            String eventVenue = scanner.nextLine();
                            System.out.println("Please enter the eventDate(format :yyyy-MM-dd):");
                            Date eventDate = java.sql.Date.valueOf(scanner.nextLine());
                            Event event = new Event(eventID, eventName, eventVenue, eventDate);
                            events.put(eventID, event);
                            System.out.println("The event was successfully created!");
                            break;
                         case "2":
                            System.out.println("Enter the ID of the event you want to manage:");
                            String id = scanner.nextLine();
                            if (events.containsKey(id)) {
                                events.get(id).organizeEvent();
                            } else {
                                System.out.println("The eventID was not found!");
                            }
                            break;
                        case "3":
                             System.out.println("Exit the program.");
                            return;
                        default:
                             System.out.println("Invalid option, please re-select.");
                            break;
                     }
                }
        }
    }
}

