package Switch;

public class Week {

    public static void main(String[] args) {
        int dayOfWeek = 3; // Let's say 1 is Monday, 2 is Tuesday, etc.
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break; // Important: Exits the switch statement
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
            case 7: // Multiple cases can share the same code
                dayName = "Weekend";
                break;
            default:
                dayName = "Invalid Day";
        }

        System.out.println("The day of the week is: " + dayName);

        // Example with String (Java 7 and later)
        String city = "Prayagraj";

        switch (city) {
            case "Prayagraj":
                System.out.println("Welcome to the city of Triveni Sangam!");
                break;
            case "Lucknow":
                System.out.println("Welcome to the city of Nawabs!");
                break;
            case "Varanasi":
                System.out.println("Welcome to the spiritual capital of India!");
                break;
            default:
                System.out.println("Welcome to another city!");
        }

        // Example with enum (Enumerated Type)
        enum TrafficSignal {
            RED, YELLOW, GREEN
        }

        TrafficSignal currentSignal = TrafficSignal.GREEN;

        switch (currentSignal) {
            case RED:
                System.out.println("Stop!");
                break;
            case YELLOW:
                System.out.println("Caution!");
                break;
            case GREEN:
                System.out.println("Go!");
                break;
        }
    }
}