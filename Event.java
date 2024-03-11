import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Event {
    private String eventID;
    private String eventName;
    private String eventVenue;
    private Date eventDate;
    private ArrayList<String> eventAttendees;

    public Event(String eventID, String eventName, String eventVenue, Date eventDate) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventDate = eventDate;
        this.eventAttendees = new ArrayList<>();
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public ArrayList<String> getEventAttendees() {
        return eventAttendees;
    }

    public void addAttendee(String attendee) {
        this.eventAttendees.add(attendee);
    }

    public void removeAttendee(String attendee) {
        this.eventAttendees.remove(attendee);
    }

    public boolean findAttendee(String attendee) {
        return this.eventAttendees.contains(attendee);
    }

    public int getNumberOfAttendees() {
        return this.eventAttendees.size();
    }

    @Override
    public String toString() {
        return "eventID: " + eventID + "\neventName: " + eventName + "\neventVenue: " + eventVenue + "\neventDate: " + eventDate + "\neventAttendees: " + eventAttendees;
    }  

    public void organizeEvent() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter your eventID:");
            this.setEventID(scanner.nextLine());
            System.out.println("Please enter your eventName:");
             this.setEventName(scanner.nextLine());
            System.out.println("Please enter your eventVenue");
            this.setEventVenue(scanner.nextLine());
            System.out.println("Please enter the eventDate(format :yyyy-MM-dd):");
            this.setEventDate(java.sql.Date.valueOf(scanner.nextLine()));
            System.out.println("Please enter a list of eventAttendees(separated by commas):");
            String[] attendees = scanner.nextLine().split(",");
            for (String attendee : attendees) {
            this.addAttendee(attendee);
            }
        }
        System.out.println("The event was successfully created!");
        System.out.println(this.toString());
    }

    public void put(String eventID2, Event event) {
        throw new UnsupportedOperationException("Unimplemented method 'put'");
    }
    public boolean containsKey(String id) {
        throw new UnsupportedOperationException("Unimplemented method 'containsKey'");
    }
    public Event get(String id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }
}